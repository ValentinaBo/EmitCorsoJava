import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {

	public void inserisci(Film f) {
			try (Connection conn = EstablishConnection.getConnection()) {
				String sql = "INSERT INTO film ("
						+ "film_id, "
						+ "title, "
						+ "description, "
						+ "release_year, "
						+ "language_id, "
						+ "original_language_id, "
						+ "rental_duration, "
						+ "rental_rate, "
						+ "length, "
						+ "replacement_cost, "
						+ "rating, "
						+ "special_features"
						+ ") VALUES ("
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				mappaturaRecord(f, ps);
				ps.executeUpdate();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void aggiorna(Film f) {
			try (Connection conn = EstablishConnection.getConnection()) {
				String sql = "UPDATE film SET "
						+ "film_id=?, "
						+ "title=?, "
						+ "description=?, "
						+ "release_year=?, "
						+ "language_id=?, "
						+ "original_language_id=?, "
						+ "rental_duration=?, "
						+ "rental_rate=?, "
						+ "length=?, "
						+ "replacement_cost=?, "
						+ "rating=?, "
						+ "special_features=? "
						+ "WHERE film_id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				mappaturaRecord(f, ps);
				ps.setInt(13, f.getFilmID());
				ps.executeUpdate();	
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void elimina(Film f) {
			try (Connection conn = EstablishConnection.getConnection()){
				String sql = "DELETE FROM film WHERE film_id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, f.getFilmID());
				ps.executeUpdate();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public List<Film> tutti() {
			List<Film> fList = new ArrayList<>();
			try (Connection conn = EstablishConnection.getConnection()) {
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM film");
				
				while (rs.next()) {
					Film f = mappaturaOggetto(rs);
					fList.add(f);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return fList;
		}
		
		public Film filmPerID(int id) {
			Film f = null;
			try (Connection conn = EstablishConnection.getConnection()) {
				String sql = "SELECT * FROM film WHERE film_id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					f = mappaturaOggetto(rs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			return f;
		}
		
		private Film mappaturaOggetto(ResultSet rs) throws SQLException {
			Film f = new Film();
			f.setFilmID(rs.getInt("film_id"));
			f.setTitle(rs.getString("title"));
			f.setDescription(rs.getString("description"));
			f.setReleaseYear(rs.getInt("release_year"));
			f.setLanguageID(rs.getInt("language_id"));
			f.setOriginalLanguageID(rs.getInt("original_language_id"));
			f.setRentalDuration(rs.getInt("rental_duration"));
			f.setRentalRate(rs.getFloat("rental_rate"));
			f.setFilmLength(rs.getInt("length"));
			f.setReplacementCost(rs.getFloat("replacement_cost"));
			f.setRating(rs.getString("rating"));
			f.setSpecialFeatures(rs.getString("special_features"));
			
			return f;
		}
		
		private void mappaturaRecord(Film f, PreparedStatement ps) throws SQLException {
			ps.setInt(1, f.getFilmID());
			ps.setString(2, f.getTitle());
			ps.setString(3, f.getDescription());
			ps.setInt(4, f.getReleaseYear());
			ps.setInt(5, f.getLanguageID());
			ps.setInt(6, f.getOriginalLanguageID());
			ps.setInt(7, f.getRentalDuration());
			ps.setFloat(8, f.getRentalRate());
			ps.setInt(9, f.getFilmLength());
			ps.setFloat(10, f.getReplacementCost());
			ps.setString(11, f.getRating());
			ps.setString(12, f.getSpecialFeatures());
		}
		
	}
