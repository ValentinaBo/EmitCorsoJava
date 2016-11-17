import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO {

	public void inserisci(Actor a) {
		
		try (Connection conn = EstablishConnection.getConnection()) {
			String sql = "INSERT INTO actor ("
					+ "actor_id, "
					+ "first_name, "
					+ "last_name"
					+ ") VALUES ("
					+ "?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			mappaturaRecord(a, ps);
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void aggiorna(Actor a) {
		try (Connection conn = EstablishConnection.getConnection()) {
			String sql = "UPDATE actor SET "
					+ "actor_id=?, "
					+ "first_name=?, "
					+ "last_name=? "
					+ "WHERE actor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			mappaturaRecord(a, ps);
			ps.setInt(4, a.getActorID());
			ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void elimina(Actor a) {
		try (Connection conn = EstablishConnection.getConnection()){
			String sql = "DELETE FROM actor WHERE actor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getActorID());
			ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Actor> tutti() {
		List<Actor> aList = new ArrayList<>();
		try (Connection conn = EstablishConnection.getConnection()) {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM actor");
			
			while (rs.next()) {
				Actor a = mappaturaOggetto(rs);
				aList.add(a);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return aList;
	}
	
	public Actor actorPerID(int id) {
		Actor a = null;
		try (Connection conn = EstablishConnection.getConnection()) {
			String sql = "SELECT * FROM actor WHERE actor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				a = mappaturaOggetto(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		return a;
	}
	
	private Actor mappaturaOggetto(ResultSet rs) throws SQLException {
		Actor a = new Actor();
		a.setActorID(rs.getInt("actor_id"));
		a.setFirstName(rs.getString("first_name"));
		a.setLastName(rs.getString("last_name"));
		return a;
		
	}
	
	private void mappaturaRecord(Actor a, PreparedStatement ps) throws SQLException {
		ps.setInt(1, a.getActorID());
		ps.setString(2, a.getFirstName());
		ps.setString(3, a.getLastName());
	}
	
}
