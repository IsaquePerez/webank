package br.com.webank.webank.dto.contaBancaria;

public class ContaBancariaRequestDTO extends ContaBancariaBaseDTO {
    
    private long idTitular;

    public long getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(long idTitular) {
        this.idTitular = idTitular;
    }

}