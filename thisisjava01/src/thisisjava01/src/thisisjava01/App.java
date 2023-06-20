package thisisjava01;

public class App {

			public static void main(String[] args) {

				System.out.println("===== Creation =====");
				Movie movie = new Movie("탑건:매버릭", "액션", "조셉 코신스키", 123);

				System.out.println("\n===== Field =====");
				movie.title = "탑건:매버릭";
				System.out.println(movie.title);

				movie.category = "액션";
				System.out.println(movie.category);

				movie.diretor = "조셉 코신스키";
				System.out.println(movie.diretor);

				movie.runningTime = 132;
				System.out.println(movie.runningTime);
			}	
	}


