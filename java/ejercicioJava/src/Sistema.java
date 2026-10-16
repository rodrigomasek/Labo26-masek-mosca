import java.util.HashSet;

public class Sistema {
    private HashSet<Bar> bares;

    public Sistema(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public Diana dianaConMasPuntajes()
    {
        Diana mayor = this.;
        for (Bar b : this.bares.)
        {
            for (Diana d : b.getDianas())
            {
                if(d.getPuntajeColor().size() > mayor.getPuntajeColor().size())
                {
                    mayor = d;                }
            }
        }
    }
}
