import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

import static java.awt.event.KeyEvent.VK_KP_DOWN;

public class RPA {
    public static void main (String[] args) {
        try {
            Robot robot = new Robot ( );

            //================Primeira Parte do Código==========================

            robot.mouseMove ( 124, 750 ); //Meu Computador
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK ); //clique
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK ); //clique
            robot.delay ( 1000 ); //demora de 1 segundo


            //dois cliques
            robot.mouseMove ( 592, 288 ); //Disco D
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1000 ); //demora de 1 segundo


            //acessar pastas planilhas
            robot.mouseMove ( 256, 129 ); //Pasta Planilhas
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1000 ); //demora de 1 segundo


            robot.mouseMove ( 258, 127 ); //Abrir Planilha
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 9000 );


            robot.mouseMove ( 643, 438 ); //Botão OK dentro da planilha
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 9000 );

            robot.mouseMove ( 481, 614 ); // Selecionar Base_Plans
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1000 );


            robot.mouseMove ( 434, 419 ); //Selecionar a Célula E6
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1000 );





            robot.keyPress ( KeyEvent.VK_SHIFT ); //Aperta o Shift
            //Seleciona as linhas
            for(int x=0;x < 367; x++){
                robot.keyPress ( KeyEvent.VK_DOWN );
                robot.keyRelease (  KeyEvent.VK_DOWN);
                robot.delay ( 20);
            }
            //Seleciona as colunas
            for(int x=0; x<131; x++){
                robot.keyPress ( KeyEvent.VK_RIGHT );
                robot.keyRelease ( KeyEvent.VK_RIGHT );
                robot.delay ( 20);
            }
            //Solta o shift
            robot.keyRelease ( KeyEvent.VK_SHIFT );
            robot.delay ( 1500 );

            //Copiar o que foi Selecionado
            robot.keyPress ( KeyEvent.VK_CONTROL );
            robot.keyPress ( KeyEvent.VK_C );
            robot.keyRelease (  KeyEvent.VK_CONTROL );
            robot.keyRelease ( KeyEvent.VK_C );
            robot.delay ( 1500 );


            robot.mouseMove ( 28, 745 );// Menu Inciar
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );


            robot.mouseMove ( 378, 503 );// Abrir Excel
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 5000 );


            robot.mouseMove ( 262, 267 );// Cliclar em colar
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );

            robot.mouseMove ( 257, 409 );// Cliclar em colar colar valores
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );

            robot.mouseMove ( 258, 168 );// Cliclar em salvar 258 168
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );

/*
            robot.mouseMove ( 720, 357 );// Cliclar para escrever 720 357
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );

 */

            robot.keyPress ( KeyEvent.VK_T );
            robot.keyRelease ( KeyEvent.VK_T );
            robot.keyPress ( KeyEvent.VK_1 );
            robot.keyRelease ( KeyEvent.VK_1 );
            robot.delay ( 1500 );

            robot.mouseMove ( 744, 450 );//Clipara diretorio para salvar 744 450
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );


            robot.mouseMove ( 719, 394 );//Selecionar Diretório 719 394
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );

            robot.mouseMove ( 904, 526 );//Clicar em Salvar 904 526
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.delay ( 1500 );


            /*
            robot.keyPress ( KeyEvent.VK_CONTROL );
            robot.keyPress ( KeyEvent.VK_C );
            robot.keyRelease (  KeyEvent.VK_CONTROL );
            robot.keyRelease ( KeyEvent.VK_C );

             */



/*
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );


            robot.delay ( 9000 );

            robot.mouseMove ( 658, 442 );//apertar ok ao abrir planilha

            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );

            robot.mouseMove ( 457, 588 ); //Selecionar Base Plans
            robot.delay ( 1500 );
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );

            robot.mouseMove ( 388, 373 ); // Selecionar E6
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );

            robot.keyPress ( KeyEvent.VK_SHIFT ); //Aperta o Shift
            //Seleciona as linhas
            for(int x=0;x < 367; x++){
                robot.keyPress ( KeyEvent.VK_DOWN );
                robot.keyRelease (  KeyEvent.VK_DOWN);
                robot.delay ( 10);
            }
            //Seleciona as colunas
            for(int x=0; x<131; x++){
                robot.keyPress ( KeyEvent.VK_RIGHT );
                robot.keyRelease ( KeyEvent.VK_RIGHT );
                robot.delay ( 10);
            }

            //Solta o shift
            robot.keyRelease ( KeyEvent.VK_SHIFT );

            robot.delay ( 1500 );
            //CTRL C
            robot.keyPress ( KeyEvent.VK_CONTROL );
            robot.keyPress ( KeyEvent.VK_C );
            robot.keyRelease (  KeyEvent.VK_CONTROL );
            robot.keyRelease ( KeyEvent.VK_C );

            //===========Segunda Parte do Còdigo

            robot.delay ( 1500 );

            robot.mouseMove ( 28, 745 );// Menu Inciar
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );

            robot.delay ( 1500 );


            robot.mouseMove ( 364, 502 );// Menu Inciar
            robot.mousePress ( InputEvent.BUTTON1_DOWN_MASK );
            robot.mouseRelease ( InputEvent.BUTTON1_DOWN_MASK );

            robot.delay ( 1500 );

            robot.keyPress ( KeyEvent.VK_CONTROL );
            robot.keyPress ( KeyEvent.VK_V );
            robot.keyRelease (  KeyEvent.VK_CONTROL );
            robot.keyRelease ( KeyEvent.VK_V );

 */



            /*
             * 1) Copiar o que foi selecionado
             * 2) Abrir novo Excel
             * 3) Colar os dados que foram copiados
             * 4) Salvar nova planilha excel
             * 5) fechar todos os documentos abertos
             * */


        } catch (AWTError | AWTException e) {
            e.printStackTrace ( );
        }
    }
}
