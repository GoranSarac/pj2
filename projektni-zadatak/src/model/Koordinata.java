package model;

public class Koordinata
{
    private Integer koordinataX;
    private Integer koordinataY;

    public Koordinata()
    {
        super();
    }

    public Koordinata(Integer koordinataX, Integer koordinataY)
    {
        super();
        this.koordinataX = koordinataX;
        this.koordinataY = koordinataY;
    }

    public Integer getKoordinataX()
    {
        return koordinataX;
    }

    public void setKoordinataX(Integer koordinataX)
    {
        this.koordinataX = koordinataX;
    }

    public Integer getKoordinataY() {
        return koordinataY;
    }

    public void setKoordinataY(Integer koordinataY) {
        this.koordinataY = koordinataY;
    }

    @Override
    public String toString() {
        return "Koordinata{" +
                "koordinataX=" + koordinataX +
                ", koordinataY=" + koordinataY +
                '}';
    }
}
