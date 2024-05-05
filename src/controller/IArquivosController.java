package controller;

import java.io.IOException;

public interface IArquivosController {

	public void readFile(String path, String nome, String ano, String mes, Double media) throws IOException;
	public void readFileAndFilter(String path, String nome, String ano, String mes) throws IOException;
	public void readDir(String path) throws IOException;
	public void createFile(String path, String nome, String[] conteudo) throws IOException;
	public void openFile(String path, String nome) throws IOException;
}
