package financeiro.util;

import financeiro.usuario.*;

public class DAOFactory 
{
	public static UsuarioDAO criarUsuarioDAO()
	{
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
