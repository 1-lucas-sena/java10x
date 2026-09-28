package Intermediario.Aula23a25;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamento) {
        this.equipamentos = equipamento;
    }

    public void adicionarEquipamento(T equipamento) {
        this.equipamentos.add(equipamento);
    }

    @Override
    public String toString(){
        return "Bolsa de equipamnetos: " + equipamentos.toString();
    }
}
