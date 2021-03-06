/*
 * Created on 03.12.2013
 */
package ch.fhnw.algd1.sudoku.framework;

/**
 * @author Wolfgang Weck
 */
public interface SudokuSolver {
	/**
	 * Bound value for of solutions to be generated by nofSolutions. Needed to cut
	 * running time for cases such as empty sets.
	 */
	public static final int MAX = 1000;

	/**
	 * Solves the Soduko in place, that is the solution is generated and kept
	 * within the model. If more than one solution is possible, an arbitrary valid
	 * one will returned.
	 * 
	 * @param model
	 *          the Sudoku to be solved
	 * 
	 * @return true: "solution found", model contains the actual solution<br>
	 *         false: no solution found, model was reset to its initial state
	 */
	boolean solved(SudokuModel model);

	/**
	 * Counts the number of solutions a specific Sudoku allows for. If there are
	 * too many possible solutions, the process to enumerate them all may take
	 * impractically long. In this case, the process may end, after MAX solutions
	 * have been found.
	 * 
	 * @param model
	 *          the Sudoku to be solved
	 * @return the number of solutions that have been generated during the
	 *         process. The model was reset to its initial state.
	 */
	int nofSolutions(SudokuModel model);
}
