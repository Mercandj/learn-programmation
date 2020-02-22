package com.mercandalli.learn_java.e_week_1_a_monday;

public class ExerciseWeek1BTuesday {

    /**
     * This function is taking in argument all the "cases" or a "morpion" 3x3.
     * <p>
     * |--------------|--------------|--------------|
     * |   topLeft    |  topMiddle   |   topRight   |
     * |--------------|--------------|--------------|
     * |  middleLeft  | middleMiddle |  middleRight |
     * |--------------|--------------|--------------|
     * |  bottomLeft  | bottomMiddle |  bottomRight |
     * |--------------|--------------|--------------|
     * <p>
     * Each "case" can be:
     * - "true" if player 1 fill the case.
     * - "false" if player 2 fill the case.
     * - "null" if no one fill the case.
     * <p>
     * Reminder:
     * A morpion is "completed" when at least one row, one column or one diagonal is "fill" for the same player.
     * <p>
     * Note:
     * In really some grid can be not possible as player are playing one after the other. Here, the grid
     * can have all the possibility, we just one to know if at least one player has complete the morpion.
     *
     * @param topLeft      The case top left
     * @param topMiddle    The case top middle
     * @param topRight     The case top right
     * @param middleLeft   The case middle left
     * @param middleMiddle The case middle middle
     * @param middleRight  The case middle right
     * @param bottomLeft   The case bottom left
     * @param bottomMiddle The case bottom middle
     * @param bottomRight  The case bottom right
     * @return The function must return true if one of player as ended the morpion. Otherwise false.
     */
    public static boolean isMorpionCompleted(
            Boolean topLeft,
            Boolean topMiddle,
            Boolean topRight,
            Boolean middleLeft,
            Boolean middleMiddle,
            Boolean middleRight,
            Boolean bottomLeft,
            Boolean bottomMiddle,
            Boolean bottomRight
    ) {
        // TODO
        return false;
    }
}
