package personasdesaparecidas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonasDesaparecidas 
{
    public static void main(String[] args) 
    {
    PersonasD conexion = new PersonasD();
    conexion.Conectar();
    }  
}
