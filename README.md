# Tic Tac Toe Game

This project is a simple Tic Tac Toe game implemented in Java using the Model-View-Controller (MVC) design pattern. The game is designed to demonstrate clean code architecture and separation of concerns.

## Features

- Two-player mode (local).
- Interactive GUI to play the game.
- Clear separation of game logic (Model), user interface (View), and control logic (Controller).
- Input validation to ensure valid moves.
- Dynamic game board display with real-time updates.
- Winner detection and display of results.

## Architecture

The project follows the MVC design pattern:

1. **Model**
   - Handles the core game logic, including:
     - Board state management.
     - Validation of moves.
     - Checking for winning conditions or ties.

2. **View**
   - Provides the graphical user interface (GUI).
   - Displays the current game state to the players.
   - Sends user inputs (such as button clicks) to the controller.

3. **Controller**
   - Acts as the mediator between the Model and View.
   - Updates the Model based on user input.
   - Updates the View based on changes in the Model.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/tictactoe-mvc.git
   cd tictactoe-mvc
   ```

2. Compile the project:
   ```bash
   javac -d bin src/*.java
   ```

3. Run the game:
   ```bash
   java -cp bin Main
   ```

## How to Play

1. Run the game.
2. The game board will be displayed, showing an empty 3x3 grid.
3. Players take turns clicking on the cells to place their marks (`X` or `O`).
4. The game will announce the winner or a tie once the game ends.
5. Reset the game to play again.

## Project Structure

```
TicTacToeMVC/
├── src/
│   ├── Main.java          # Entry point of the application
│   ├── model/
│   │   └── TicTacToeModel.java   # Handles game logic
│   ├── view/
│   │   └── TicTacToeView.java    # Displays the GUI
│   └── controller/
│       └── TicTacToeController.java # Handles user input and game flow
└── README.md              # Project documentation
```

## Future Enhancements

- Add AI for single-player mode.
- Allow customization of board size.
- Implement a score tracking system.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspiration: Classic Tic Tac Toe games.
- Tools: Java Swing for GUI development.
