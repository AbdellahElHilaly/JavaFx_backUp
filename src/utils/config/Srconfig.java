package utils.config;

public class Srconfig {

  
  private String ip;
  private String port;
  private String user;
  private String password;
  private String database;
  private String table;
  private String column;
  private String row;

  public Srconfig() {
    // get data from file using helper
  }


  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getDatabase() {
    return database;
  }
  public void setDatabase(String database) {
    this.database = database;
  }
  public String getTable() {
    return table;
  }
  public void setTable(String table) {
    this.table = table;
  }
  public String getColumn() {
    return column;
  }
  public void setColumn(String column) {
    this.column = column;
  }
  public String getRow() {
    return row;
  }
  public void setRow(String row) {
    this.row = row;
  }

  
}
