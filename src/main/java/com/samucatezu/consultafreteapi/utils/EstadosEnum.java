package com.samucatezu.consultafreteapi.utils;

public enum EstadosEnum {
    SAOPAULO("SP", "SUDESTE", "7.85"), MINASGERAIS("MG", "SUDESTE", "7.85"), ESPIRITOSANTO("ES", "SUDESTE", "7.85"), RIODEJANEIRO("RJ", "SUDESTE", "7.85"),
    RIOGRANDEDOSUL("RS", "SUL", "17.30"), SANTACATARINA("SC", "SUL", "17.30"), PARANA("PR", "SUL", "17.30"),
    MATOGROSSODOSUL("MS", "CENTRO-OESTE", "12.50"), GOIAS("GO", "CENTRO-OESTE", "12.50"), MATOGROSSO("MT", "CENTRO-OESTE", "12.50"),  DISTRITOFEDERAL("DF", "CENTRO-OESTE", "12.50"),
    ACRE("AC", "NORTE", "20.83"), AMAZONAS("AM", "NORTE", "20.83"), RORAIMA("RR", "NORTE", "20.83"), PARA("PA", "NORTE", "20.83"), TOCANTINS("TO", "NORTE", "20.83"), AMAPA("AP", "NORTE", "20.83"), RONDONIA("RO", "NORTE", "20.83"),
    MARANHAO("MA", "NORDESTE", "15.98"), PIAUI("PI", "NORDESTE", "15.98"), BAHIA("BA", "NORDESTE", "15.98"), SERGIPE("SE", "NORDESTE", "15.98"), ALAGOAS("AL", "NORDESTE", "15.98"), PERNAMBUCO("PE", "NORDESTE", "15.98"), PARAIBA("PB", "NORDESTE", "15.98"), RIOGRANDEDONORTE("RN", "NORDESTE", "15.98"), CEARA("CE","NORDESTE", "15.98"),
    ;

    private String nomeEstado;
    private String regiao;
    private String valorFrete;

    EstadosEnum(String nomeEstado, String regiao, String valorFrete) {
        this.nomeEstado = nomeEstado;
        this.regiao = regiao;
        this.valorFrete = valorFrete;
    }

    @Override
    public String toString() {
        return this.nomeEstado;
    }

    public static String find(String nomeEstado) {
        for(EstadosEnum indicador: EstadosEnum.values()){
            if(indicador.toString().equals(nomeEstado)){
                return indicador.valorFrete;
            }
        }
        return null;
    }
}
