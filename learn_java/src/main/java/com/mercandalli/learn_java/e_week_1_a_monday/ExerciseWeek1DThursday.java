package com.mercandalli.learn_java.e_week_1_a_monday;

import java.util.List;

public class ExerciseWeek1DThursday {

    enum MorpionCaseValue {
        EMPTY,
        MARKED_FOR_PLAYER_1,
        MARKED_FOR_PLAYER_2
    }

    /**
     * This function is taking in argument all the "cases" or a "morpion" 3x3.
     * <p>
     * |--------------|--------------|--------------|
     * |   topLeft    |  topMiddle   |   topRight   | <--- rowTop
     * |--------------|--------------|--------------|
     * |  middleLeft  | middleMiddle |  middleRight | <--- rowMiddle
     * |--------------|--------------|--------------|
     * |  bottomLeft  | bottomMiddle |  bottomRight | <--- rowBottom
     * |--------------|--------------|--------------|
     * <p>
     * Each "case" can be:
     * - "MorpionCaseValue.MARKED_FOR_PLAYER_1" if player 1 fill the case.
     * - "MorpionCaseValue.MARKED_FOR_PLAYER_2" if player 2 fill the case.
     * - "MorpionCaseValue.EMPTY" if no one fill the case.
     * <p>
     * Reminder:
     * A morpion is "completed" when at least one row, one column or one diagonal is "fill" for the same player.
     * <p>
     * Note:
     * In really some grid can be not possible as player are playing one after the other. Here, the grid
     * can have all the possibility, we just one to know if at least one player has complete the morpion.
     *
     * @param rowTop    The top row of the grid
     * @param rowMiddle The middle row of the grid
     * @param rowBottom The bottom row of the grid
     * @return The function must return true if one of player as ended the morpion. Otherwise false.
     */
    public static boolean isMorpionCompleted(
            List<MorpionCaseValue> rowTop,
            List<MorpionCaseValue> rowMiddle,
            List<MorpionCaseValue> rowBottom
    ) {
        // TODO
        return false;
    }
}
