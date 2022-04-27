
import com.wix.mysql.EmbeddedMysql;
import com.wix.mysql.config.MysqldConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import static com.wix.mysql.EmbeddedMysql.anEmbeddedMysql;
import static com.wix.mysql.ScriptResolver.classPathScript;
import static com.wix.mysql.config.MysqldConfig.aMysqldConfig;
import static com.wix.mysql.distribution.Version.v5_6_latest;

public abstract class EmbeddedMySql {
    public static Connection conn;
    private static  EmbeddedMysql mysqld;
    @BeforeAll
    public static void initiMySql() throws IOException, SQLException {
        MysqldConfig config = aMysqldConfig(v5_6_latest)
                .withPort(3306)
                .withUser("root", "password123")
                .build();
        File resourcesDirectory = new File("src/test/resources");

        mysqld = anEmbeddedMysql(config)
                .addSchema("world", classPathScript(resourcesDirectory.getAbsolutePath()+"world.sql"))
                .start();
        conn = DriverManager.getConnection(
                "jdbc:mysql://db:3306/world?useSSL=false", "root", "password123");
    }

    @AfterAll
    public static void stopMySql() throws SQLException {
        // close db connection
        if(conn != null) {
            conn.close();
        }
        if(mysqld != null) {
            mysqld.stop();
        }
    }
}
