package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.statusPedido;

public class Pedido {

	private Date moment;
	private statusPedido status;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<itemPedido> lista = new ArrayList<>();
	private Cliente cliente;

	public Pedido() {
	}

	public Pedido(Date moment, statusPedido status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public statusPedido getStatus() {
		return status;
	}

	public void setStatus(statusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adcPedido(itemPedido pedido) {
		lista.add(pedido);
	}

	public void remPedido(itemPedido pedido) {
		lista.remove(pedido);
	}

	public Double total() {
		double soma = 0.0;
		for (itemPedido x : lista) {
			soma += x.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(moment));
		sb.append("\nStatus do pedido: " + status);
		sb.append("\nCliente: " + cliente);
		sb.append("\nItem do pedido: ");
		for (itemPedido x : lista) {
			sb.append(x + "\n");
		}
		sb.append("\nPreço total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
