package financeiro.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtil 
{
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory()
	{
		try
		{
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		}
		catch(Throwable e)
		{
			System.out.println("Criação inicial o objeto SessionFactory falhou. Erro: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

}
