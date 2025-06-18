package adapter;
/*
l'adapter è una classe che discende dall'interfaccia in uso, ma ingloba al suo interno un oggetto che discende
dalla nuova interfaccia. In questo modo un oggetto Adapter potrà essere inserito nel calcolatoreFigure perchè compatibile
con l'interfaccia Figura e quindi poter calcolare perimetro ed area anche degli oggetti che discendono da
FiguraGeometrica
 */
public class FiguraGeometricaAdapter implements Figura{

    private FigureGeometriche figureGeometriche;

    public FiguraGeometricaAdapter(FigureGeometriche figureGeometriche) {
        this.figureGeometriche = figureGeometriche;
    }

    public FigureGeometriche getFigureGeometriche() {
        return figureGeometriche;
    }

    public void setFigureGeometriche(FigureGeometriche figureGeometriche) {
        this.figureGeometriche = figureGeometriche;
    }

    @Override
    public double perimetro() {
        return figureGeometriche.perimetro();
    }

    @Override
    public double area() {
        return figureGeometriche.area();
    }
}
