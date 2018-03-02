package net.md_5.bungee.protocol;

import java.util.Arrays;
import java.util.List;

public class ProtocolConstants
{
    public static final int MINECRAFT_1_6_1 = 1;
    public static final int MINECRAFT_1_6_2 = 2;
    public static final int MINECRAFT_1_6_4 = 3;
    public static final int MINECRAFT_1_7_2 = 4;
    public static final int MINECRAFT_1_7_6 = 5;
    public static final int MINECRAFT_1_8 = 47;
    public static final int MINECRAFT_1_9 = 107;
    public static final int MINECRAFT_1_9_1 = 108;
    public static final int MINECRAFT_1_9_2 = 109;
    public static final int MINECRAFT_1_9_4 = 110;
    public static final int MINECRAFT_1_10 = 210;
    public static final int MINECRAFT_1_11 = 315;
    public static final int MINECRAFT_1_11_1 = 316;
    public static final List<String> SUPPORTED_VERSIONS = Arrays.asList(
            "1.6.x-1.11.x"
    );

    public static final List<Integer> SUPPORTED_VERSION_IDS = Arrays.asList(
            ProtocolConstants.MINECRAFT_1_6_1,
            ProtocolConstants.MINECRAFT_1_6_2,
            ProtocolConstants.MINECRAFT_1_6_4,
            ProtocolConstants.MINECRAFT_1_7_2,
            ProtocolConstants.MINECRAFT_1_7_6,
            ProtocolConstants.MINECRAFT_1_8,
            ProtocolConstants.MINECRAFT_1_9,
            ProtocolConstants.MINECRAFT_1_9_1,
            ProtocolConstants.MINECRAFT_1_9_2,
            ProtocolConstants.MINECRAFT_1_9_4,
            ProtocolConstants.MINECRAFT_1_10,
            ProtocolConstants.MINECRAFT_1_11,
            ProtocolConstants.MINECRAFT_1_11_1
    );

    public enum Direction
    {

        TO_CLIENT, TO_SERVER;
    }
}
