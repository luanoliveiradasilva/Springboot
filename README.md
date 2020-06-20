# Springboot

<h2>HashCod</h2>

O hashCode é usado para montar tabelas de hash. É uma tabela onde as informações são armazenadas conforme um "número hash" calculado com base nas propriedades da informação.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
  
  <h2>Referências:</h2>
  https://blog.algaworks.com/entendendo-o-equals-e-hashcode/</br>
  https://medium.com/@angeliski/equals-e-hashcode-o-que-%C3%A9-porque-usar-e-como-implementar-1ee70fa67396</br>
