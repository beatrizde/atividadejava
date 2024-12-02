package classes;
 
public class Sala {
 
	private Integer numero_id;
	private String descricao;
	
	public Integer getNumero_id() {
		return numero_id;
	}
	public void setNumero_id(Integer numero_id) {
		this.numero_id = numero_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
	public String cadastrar() {
		String msg = "Sala cadastrada com sucesso!";
				return msg;
	 }
}