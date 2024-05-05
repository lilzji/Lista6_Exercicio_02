package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String path = "C:\\TEMP";
		String nome = "SteamCharts.csv";
		String ano = "2020";
		String mes = "June";
		Double media = 671647.46;
		
		try {
			arqCont.readFile(path, nome, ano, mes, media);
			arqCont.readFileAndFilter(path, nome, ano, mes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
