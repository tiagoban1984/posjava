package model;

public class Userposjava {

		private long id;
		private String nome;
		private String email;
		private String cpf;
		private String setor;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getSetor() {
			return setor;
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		@Override
		public String toString() {
			return "Userposjava [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", setor=" + setor
					+ "]";
		}
		
		

}
