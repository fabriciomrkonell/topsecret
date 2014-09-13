package org.catolicasc.beer.service;

import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebFault;

@WebFault(targetNamespace = "http://service.acervo.catolicasc.org.br/exceccoes/", name = "UsuarioNaoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception {
	private static final long serialVersionUID = 1L;

	public UsuarioNaoAutorizadoException() {
		super();
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsuarioNaoAutorizadoException(String message) {
		super(message);
	}

	public UsuarioNaoAutorizadoException(Throwable cause) {
		super(cause);
	}

	public UsuarioFaultInfo getFaultInfo()
			throws DatatypeConfigurationException {
		return new UsuarioFaultInfo(getMessage());
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	public static class UsuarioFaultInfo {
		@XmlAttribute
		private String mensagem;
		private XMLGregorianCalendar data;

		public UsuarioFaultInfo(String mensagem) {
			this.mensagem = mensagem;
			try {

				this.data = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(new GregorianCalendar());
				this.data.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
				this.data.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			} catch (DatatypeConfigurationException e) {
				throw new RuntimeException(e);
			}

		}

		public UsuarioFaultInfo() {
		}
	}

}
