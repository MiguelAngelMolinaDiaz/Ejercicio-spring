package com.Clases.Tema26.Composicion;

public class Caballo {
    private Cerebro cerebro;
    private List<Pata> patasList;
    private Montura montura;

    public Caballo() {
       this.pataList = new ArrayList<>();
       this.pataList.add(new Pata());
       this.pataList.add(new Pata());
       this.pataList.add(new Pata());
       this.pataList.add(new Pata()); 
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public void setCerebro(Cerebro cerebro) {
        this.cerebro = cerebro;
    }

    public List<Pata> getPataList() {
        return patasList;
    }

    public void setPataList(List<Pata> patasList) {
        this.patasList = patasList;
    }

    
}
