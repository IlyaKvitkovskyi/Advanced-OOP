package runner;

import service.FigureService;

public class Runner {

    public static void main(String[] args) {

        FigureService figureService = new FigureService();

        figureService.generateRandomFigure();
        figureService.print();
    }
}
