package ex.mod7;

/**
 *@author Vinícius Ribeiro
 *@version 1.00
 **/

public class Carro {

		private String nome;
		private int anoFabricaçao;
		private String fabricante;
		private double preço;
		
		public Carro() {
			
		}
		
		public Carro(String nome, int anoFabricaçao, String fabricante, double preço) {
			this.nome = nome;
			this.anoFabricaçao = anoFabricaçao;
			this.fabricante = fabricante;
			this.preço = preço;
		}

		/**Método busca o nome do carro
		 *@version 1.0
		 *@return nome do carro
		 **/
		public String getNome() {
			return nome;
		}
		
		/**Método insere o nome do carro
		 *@version 1.0
		 *@return nome do carro
		 **/
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		/**Método busca o ano de fabricação do carro
		 *@version 1.0
		 *@return ano de fabricação do carro
		 **/
		public int getAnoFabricaçao() {
			return anoFabricaçao;
		}

		/**Método insere o ano de fabricação do carro
		 *@version 1.0
		 *@return ano de fabricação do carro
		 **/
		public void setAnoFabricaçao(int anoFabricaçao) {
			this.anoFabricaçao = anoFabricaçao;
		}

		/**Método busca nome do fabricante
		 *@version 1.0
		 *@return o nome do frabricante
		 **/
		public String getFabricante() {
			return fabricante;
		}
		
		/**Método insere o nome do fabricante
		 *@version 1.0
		 *@return o nome do frabricante
		 **/
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		
		/**Método busca o preço do carro
		 *@version 1.0
		 *@return o preço do carro
		 **/
		public double getPreço() {
			return preço;
		}

		/**Método insere o preço do carro
		 *@version 1.0
		 *@return o preço do carro
		 **/
		public void setPreço(double preço) {
			this.preço = preço;
		}
	
	
}
