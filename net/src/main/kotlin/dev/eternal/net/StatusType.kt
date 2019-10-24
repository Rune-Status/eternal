package dev.eternal.net

/**
 * The various status values that tell the game the result
 * of a network action.
 *
 * @author Cody Fullen
 */
enum class StatusType(val id: Int) {

    ACCEPTABLE(0),
    LOGGED_IN(2),
    INVALID_CREDENTIALS(3),
    ACCOUNT_BANNED(4),
    ALREADY_ONLINE(5),
    REVISION_MISMATCH(6),
    WORLD_FULL(7),
    SERVER_OFFLINE(8),
    MAX_PLAYERS(9),
    BAD_SESSION_ID(10),
    ACCOUNT_HACKED(11),
    MEMBER_WORLD(12),
    COULD_NOT_COMPLETE_LOGIN(13),
    SERVER_UPDATE(14),
    MAX_ATTEMPTS(16),
    ACCOUNT_LOCKED(18),
    IN_BETA(19),
    INVALID_LOGINSERVER(20),
    WORLD_SWITCH(21),
    MALFORMED_PACKET(22),
    NO_DATA_LOGINSERVER(23),
    IP_BAN(26),
    NO_DISPLAY_NAME(31),
    VOTE_TO_PLAY(38),
    REQUIRE_AUTH(56),
    INCORRECT_AUTH(57)

}