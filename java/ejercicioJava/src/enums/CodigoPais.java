package enums;

public enum CodigoPais {
    ARGENTINA(1000),
    UNITED_STATES(1001),
    CANADA(1002),
    MEXICO(1003),
    BRAZIL(1004),
    CHILE(1005),
    PERU(1006),
    COLOMBIA(1007),
    URUGUAY(1008),
    PARAGUAY(1009),
    BOLIVIA(1010),
    ECUADOR(1011),
    VENEZUELA(1012),
    COSTA_RICA(1013),
    PANAMA(1014),
    GUATEMALA(1015),
    HONDURAS(1016),
    EL_SALVADOR(1017),
    NICARAGUA(1018),
    CUBA(1019),
    DOMINICAN_REPUBLIC(1020),
    SPAIN(1021),
    PORTUGAL(1022),
    FRANCE(1023),
    GERMANY(1024),
    ITALY(1025),
    UNITED_KINGDOM(1026),
    IRELAND(1027),
    NETHERLANDS(1028),
    BELGIUM(1029),
    SWITZERLAND(1030),
    AUSTRIA(1031),
    SWEDEN(1032),
    NORWAY(1033),
    DENMARK(1034),
    FINLAND(1035),
    POLAND(1036),
    CZECH_REPUBLIC(1037),
    HUNGARY(1038),
    ROMANIA(1039),
    GREECE(1040),
    TURKEY(1041),
    RUSSIA(1042),
    CHINA(1043),
    JAPAN(1044),
    SOUTH_KOREA(1045),
    INDIA(1046),
    AUSTRALIA(1047),
    NEW_ZEALAND(1048),
    SOUTH_AFRICA(1049);

    private int codigo;

    CodigoPais(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
