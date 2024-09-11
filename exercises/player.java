/*
1. Create a class Player with public member variables name and points.
a. In the main program, create two Player objects with different values and print the values of both objects.
b. Define a third Player object and copy to it the same data as the second one created above.
2. Add a method addPoints to the Player class, which takes a point value as a parameter and adds it to the player's points.
a. Add a check to ensure that the points added are not negative.
3. Add a method getInfo that returns the player's information as a string in the format "Player x has y points".
4. Set the class member variables to private and add getters for them. Also, add a setter for the name.
5. Create a player and set a name for it.
a. Add points to the player three separate times.
b. Print the player's information.
c. Set a new name for the player.
d. Print the player's information again.
*/


class Player {
	private String name;
	private int points;

	// Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for points
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void addPoints(int pointsToAdd) {
		if (pointsToAdd >= 0) {
			this.points += pointsToAdd;
		} else {
			System.out.println("Error: points can't be negative!!!");
		}
	}

	public String getInfo() {
		return "Player " + this.name + " has " + this.points + " points";
	}
}


public class player {
	public static void main(String[] args) {

		// Player 1
		Player player1 = new Player();
		player1.setName("Kalle");
		player1.setPoints(22);
		System.out.println("Player 1: " + player1.getName() + " " + player1.getPoints());

		// Player 2
		Player player2 = new Player();
		player2.setName("Suvi");
		player2.setPoints(33);
		System.out.println("Player 2: " + player2.getName() + " " + player2.getPoints());

		// Player 3 (kopioidaan Player 2:n tiedot)
		Player player3 = new Player();
		player3.setName(player2.getName());
		player3.setPoints(player2.getPoints());
		System.out.println("Player 3: " + player3.getName() + " " + player3.getPoints());

		// test that addPoints-method works
		player1.addPoints(10);
		System.out.println("Player 1 after adding points: " + player1.getInfo());

		player2.addPoints(-5);
		System.out.println("Player 2 after trying to add negative points: " + player2.getInfo());

		// New player
		Player newPlayer = new Player();
		newPlayer.setName("John");

		// Add points three times
		newPlayer.addPoints(111);
		newPlayer.addPoints(1);
		newPlayer.addPoints(96);

		// Print player's info
		System.out.println("Our new Player: " + newPlayer.getInfo());

		// Set a new name
		newPlayer.setName("Henri");

		// Print player's information again
		System.out.println("Our new Player: " + newPlayer.getInfo());
	}
}