package net.codejava.spring.config;

import javax.sql.DataSource;

import net.codejava.spring.action.BookingAction;
import net.codejava.spring.action.ClubInfoAction;
import net.codejava.spring.action.ContactAction;
import net.codejava.spring.action.MatchAction;
import net.codejava.spring.action.NewsAction;
import net.codejava.spring.action.SearchNewsAction;
import net.codejava.spring.action.StadiumsAction;
import net.codejava.spring.action.TicketAction;
import net.codejava.spring.action.UsersAction;
import net.codejava.spring.dao.BookingDAO;
import net.codejava.spring.dao.ClubInfoDAO;
import net.codejava.spring.dao.ContactDAO;
import net.codejava.spring.dao.MatchDAO;
import net.codejava.spring.dao.NewsDAO;
import net.codejava.spring.dao.SearchNewsDAO;
import net.codejava.spring.dao.StadiumsDAO;
import net.codejava.spring.dao.TicketsDAO;
import net.codejava.spring.dao.UsersDAO;
import net.codejava.spring.dao.impl.BookingDAOImpl;
import net.codejava.spring.dao.impl.ClubInfoDAOImpl;
import net.codejava.spring.dao.impl.ContactDAOImpl;
import net.codejava.spring.dao.impl.MatchDAOImpl;
import net.codejava.spring.dao.impl.NewsDAOImpl;
import net.codejava.spring.dao.impl.SearchNewsDAOImpl;
import net.codejava.spring.dao.impl.StadiumsDAOImpl;
import net.codejava.spring.dao.impl.TicketsDAOImpl;
import net.codejava.spring.dao.impl.UsersDAOImpl;
import net.codejava.spring.service.BookingService;
import net.codejava.spring.service.ClubInfoService;
import net.codejava.spring.service.ContactService;
import net.codejava.spring.service.MatchService;
import net.codejava.spring.service.NewsService;
import net.codejava.spring.service.SearchNewsService;
import net.codejava.spring.service.StadiumsService;
import net.codejava.spring.service.TicketsService;
import net.codejava.spring.service.UsersService;
import net.codejava.spring.service.impl.BookingServiceImpl;
import net.codejava.spring.service.impl.ClubInfoServiceImpl;
import net.codejava.spring.service.impl.ContactServiceImpl;
import net.codejava.spring.service.impl.MatchServiceImpl;
import net.codejava.spring.service.impl.NewsServiceImpl;
import net.codejava.spring.service.impl.SearchNewsServiceImpl;
import net.codejava.spring.service.impl.StadiumsServiceImpl;
import net.codejava.spring.service.impl.TicketsServiceImpl;
import net.codejava.spring.service.impl.UsersServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Đây là ConfigSpring.
 * 
 * @author DungLT-27/02/2017
 * 
 */
@Configuration
@ComponentScan(basePackages="net.codejava.spring")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //Properties props = new Properties();
        //props.setProperty("connectionCollation", "utf8_unicode_ci");
        /*dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");*/

        //dataSource.setConnectionProperties(props);
        //dataSource.setUrl("jdbc:mysql://localhost:3306/booking");
        //dataSource.setUrl("jdbc:mysql://localhost:3306/footballstore");
        //dataSource.setUrl("jdbc:mysql://localhost:3306/sportbooking?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sportbooking");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        /*dataSource.setDriverClassName("mongodb.jdbc.MongoDriver");
        dataSource.setUrl("jdbc:mongo://103.63.109.13:27017/FBFootball");
        dataSource.setUsername("root");
        dataSource.setPassword("");*/

        return dataSource;
    }

    /** Generate items for class Contact*/
    @Bean
    public ContactAction getContactAction() {
        return new ContactAction();
    }

    @Bean
    public ContactService getContactService() {
        //return new ContactServiceImpl(getDataSource());
        return new ContactServiceImpl();
    }

    @Bean
    public ContactDAO getContactDAO() {
        return new ContactDAOImpl(getDataSource());
    }

    /** Generate items for class Match*/
    @Bean
    public MatchAction getMatchAction() {
        return new MatchAction();
    }

    @Bean
    public MatchService getMatchService() {
        return new MatchServiceImpl();
    }

    @Bean
    public MatchDAO getMatchDAO() {
        return new MatchDAOImpl(getDataSource());
    }

    /** Generate items for class Booking*/
    @Bean
    public BookingAction getBookingAction() {
        return new BookingAction();
    }

    @Bean
    public BookingService getBookingService() {
        return new BookingServiceImpl();
    }

    @Bean
    public BookingDAO getBookingDAO() {
        return new BookingDAOImpl(getDataSource());
    }

    /** Generate items for class ClubInfo*/
    @Bean
    public ClubInfoAction getClubInfoAction() {
        return new ClubInfoAction();
    }

    @Bean
    public ClubInfoService getClubInfoService() {
        return new ClubInfoServiceImpl();
    }

    @Bean
    public ClubInfoDAO getClubInfoDAO() {
        return new ClubInfoDAOImpl(getDataSource());
    }

    /** Generate items for class SearchNews*/
    @Bean
    public SearchNewsAction getSearchNewsAction() {
        return new SearchNewsAction();
    }

    @Bean
    public SearchNewsService getSearchNewsService() {
        return new SearchNewsServiceImpl();
    }

    @Bean
    public SearchNewsDAO getSearchNewsDAO() {
        return new SearchNewsDAOImpl(getDataSource());
    }

    /** Generate items for class Admin Manager News*/
    @Bean
    public NewsAction getNewsAction() {
        return new NewsAction();
    }

    @Bean
    public NewsService getNewsService() {
        return new NewsServiceImpl();
    }

    @Bean
    public NewsDAO getNewsDAO() {
        return new NewsDAOImpl(getDataSource());
    }

    /** Generate items for class Admin Manager Users*/
    @Bean
    public UsersAction getUsersAction() {
        return new UsersAction();
    }

    @Bean
    public UsersService getUsersService() {
        return new UsersServiceImpl();
    }

    @Bean
    public UsersDAO getUsersDAO() {
        return new UsersDAOImpl(getDataSource());
    }

    /** Generate items for class Admin Manager Tickets*/
    @Bean
    public TicketAction getTicketsAction() {
        return new TicketAction();
    }

    @Bean
    public TicketsService getTicketsService() {
        return new TicketsServiceImpl();
    }

    @Bean
    public TicketsDAO getTicketsDAO() {
        return new TicketsDAOImpl(getDataSource());
    }

    /** Generate items for class Admin Manager Stadiums*/
    @Bean
    public StadiumsAction getStadiumsAction() {
        return new StadiumsAction();
    }

    @Bean
    public StadiumsService getStadiumsService() {
        return new StadiumsServiceImpl();
    }

    @Bean
    public StadiumsDAO getStadiumsDAO() {
        return new StadiumsDAOImpl(getDataSource());
    }
}
