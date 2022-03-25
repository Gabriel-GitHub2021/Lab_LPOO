package Principal;

public class Robo {
	
	private short codigoDeIdentificacao;
	private String versao;
	private Data dataDeCriacao;
	
	public void incluiDadosNoRobo(short codigo, String versao, byte dia, byte mes, short ano) {
		
		dataDeCriacao = new Data();
		codigoDeIdentificacao = codigo;
		this.versao = versao;
		this.dataDeCriacao.setDia(dia);
		this.dataDeCriacao.setMes(mes);
		this.dataDeCriacao.setAno(ano);
	}
	
	public String mostraDados() {
		return " Versao: " + this.versao + 
				"\n Codigo do robo: " + this.codigoDeIdentificacao +
				"\n Data de criacao: " +
				dataDeCriacao.getDia() + "/" +
				dataDeCriacao.getMes() + "/" +
				dataDeCriacao.getAno();
				
	}
	
}
