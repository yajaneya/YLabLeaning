/*
    DOM-реализация парсера для чтения xml-файла
    Этот класс предоставляет API для чтения из xml-файла
    данных о прошедших играх.
 */

package ru.yajaneya.ylab.dz2.xmlParser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.models.Step;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomReaderXml implements ReaderXml{
    File file;
    Document document;

    public DomReaderXml(String file) {
        this.file = new File(file);
    }

    public DomReaderXml(File file) {
        this.file = file;
    }

    @Override
    public boolean init() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            return true;
        } catch ( ParserConfigurationException | SAXException | IOException e) {
            return false;
        }
    }

    @Override
    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeName().equals("Player")) {
                players.add(getPlayer(node));
            }
        }
        return players;
    }

    @Override
    public List<Step> getSteps() {
        int num = 0, playerId = 0, x, y;
        List<Step> steps = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("Step");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            NamedNodeMap attributes = node.getAttributes();
            for (int j = 0; j < attributes.getLength(); j++) {
                Node attr = attributes.item(j);
                if (attr.getNodeName().equals("num")) {
                    num = Integer.parseInt(attr.getNodeValue());
                }
                if (attr.getNodeName().equals("playerId")) {
                    playerId = Integer.parseInt(attr.getNodeValue());
                }
            }
            String[] content = node.getTextContent().split(",");
            x = Integer.parseInt(content[0]);
            y = Integer.parseInt(content[1]);
            steps.add(new Step(num, playerId, x, y));
        }
        return steps;
    }

    @Override
    public Player getResult() {
        try {
            Node node = document.getDocumentElement()
                    .getElementsByTagName("GameResult").item(0)
                    .getChildNodes().item(0);
            return getPlayer(node);
        } catch (NullPointerException e) {
            return null;
        }
    }

    private Player getPlayer (Node node) {
        int id = 0;
        String name = "";
        char symbol = 0;
        NamedNodeMap attributes = node.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node attr = attributes.item(i);
            if (attr.getNodeName().equals("id")) {
                id = Integer.parseInt(attr.getNodeValue());
            }
            if (attr.getNodeName().equals("name")) {
                name = attr.getNodeValue();
            }
            if (attr.getNodeName().equals("symbol")) {
                symbol = attr.getNodeValue().toCharArray()[0];
            }
        }
        return new Player(id, name, symbol);
    }
}
