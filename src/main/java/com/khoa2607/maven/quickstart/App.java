package com.khoa2607.maven.quickstart;

import java.io.IOException;

import io.silverspoon.bulldog.beagleboneblack.BBBNames;
import io.silverspoon.bulldog.core.Signal;
import io.silverspoon.bulldog.core.gpio.DigitalIO;
import io.silverspoon.bulldog.core.gpio.DigitalOutput;
import io.silverspoon.bulldog.core.platform.Board;
import io.silverspoon.bulldog.core.platform.Platform;
import io.silverspoon.bulldog.core.util.BulldogUtil;

/**
 * Hello BBB
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
    	Board board = Platform.createBoard();
    	
    	DigitalIO output = board.getPin(BBBNames.P8_12).as(DigitalIO.class);

    	//set high
    	output.write(Signal.High);
        
        output.toggle();
        BulldogUtil.sleepMs(500);
          
        while (true) {
            BulldogUtil.sleepMs(50);
         }
    }     
}
