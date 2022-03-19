package ru.yajaneya.ylab.dz2.fabrics;

import ru.yajaneya.ylab.dz2.Parser.*;

public class HistoryFabric {

    public ReaderParser getReadParser () {
//        return new DomReaderParserXml();
        return new ReaderParserJson();
    }

    public WriterParser getWriteParser () {
//        return new FileWriterParserXml();
        return new WriterParserJson();
    }
}
