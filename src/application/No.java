package application;

public class No {
	private No direita;
	private No esquerda;
	private long valor;

	public No(long valor) {
		this.setValor(valor);
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direita == null) ? 0 : direita.hashCode());
		result = prime * result + ((esquerda == null) ? 0 : esquerda.hashCode());
		result = prime * result + (int) (valor ^ (valor >>> 32));
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
		No other = (No) obj;
		if (direita == null) {
			if (other.direita != null)
				return false;
		} else if (!direita.equals(other.direita))
			return false;
		if (esquerda == null) {
			if (other.esquerda != null)
				return false;
		} else if (!esquerda.equals(other.esquerda))
			return false;
		if (valor != other.valor)
			return false;
		return true;
	}
}
