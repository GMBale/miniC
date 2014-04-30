/* The following code was generated by JFlex 1.5.1 */

package default_package;
  
import java_cup.runtime.*;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>miniC.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\13\1\12\1\0\1\13\1\11\22\0\1\13\1\2\6\0"+
    "\1\16\1\17\1\4\1\14\1\24\1\15\1\10\1\4\12\7\1\26"+
    "\1\25\1\3\1\1\1\3\2\0\32\5\1\22\1\0\1\23\1\0"+
    "\1\6\1\0\1\35\1\46\1\45\1\41\1\37\1\32\1\5\1\43"+
    "\1\27\1\5\1\47\1\33\1\5\1\30\1\34\2\5\1\36\1\44"+
    "\1\31\1\40\1\5\1\42\3\5\1\20\1\0\1\21\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\2\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\11\5\1\24\1\3"+
    "\1\0\1\5\1\25\4\5\1\26\5\5\1\27\1\30"+
    "\1\5\1\31\11\5\1\32\3\5\1\33\1\5\1\34"+
    "\2\5\1\35\1\5\1\36\1\37\1\5\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\120\0\170\0\50\0\240\0\310"+
    "\0\360\0\50\0\50\0\50\0\50\0\50\0\50\0\50"+
    "\0\50\0\50\0\50\0\50\0\50\0\50\0\u0118\0\u0140"+
    "\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258\0\50"+
    "\0\50\0\u0280\0\u02a8\0\240\0\u02d0\0\u02f8\0\u0320\0\u0348"+
    "\0\240\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0280\0\240"+
    "\0\u0438\0\240\0\u0460\0\u0488\0\u04b0\0\u04d8\0\u0500\0\u0528"+
    "\0\u0550\0\u0578\0\u05a0\0\240\0\u05c8\0\u05f0\0\u0618\0\240"+
    "\0\u0640\0\240\0\u0668\0\u0690\0\240\0\u06b8\0\240\0\240"+
    "\0\u06e0\0\240\0\240";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\2\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\2\7\1\30\3\7\1\31\1\32\1\7\1\33\1\34"+
    "\1\7\1\35\1\36\1\37\1\7\51\0\1\40\47\0"+
    "\1\41\53\0\3\7\17\0\21\7\7\0\1\10\1\42"+
    "\51\0\1\12\42\0\3\7\17\0\1\7\1\43\1\7"+
    "\1\44\15\7\5\0\3\7\17\0\4\7\1\45\1\46"+
    "\13\7\5\0\3\7\17\0\10\7\1\47\10\7\5\0"+
    "\3\7\17\0\4\7\1\50\14\7\5\0\3\7\17\0"+
    "\5\7\1\51\2\7\1\52\10\7\5\0\3\7\17\0"+
    "\14\7\1\53\4\7\5\0\3\7\17\0\13\7\1\54"+
    "\5\7\5\0\3\7\17\0\6\7\1\55\12\7\5\0"+
    "\3\7\17\0\7\7\1\56\11\7\7\0\1\57\45\0"+
    "\3\7\17\0\2\7\1\60\16\7\5\0\3\7\17\0"+
    "\5\7\1\61\13\7\5\0\3\7\17\0\7\7\1\62"+
    "\11\7\5\0\3\7\17\0\2\7\1\63\16\7\5\0"+
    "\3\7\17\0\15\7\1\64\3\7\5\0\3\7\17\0"+
    "\3\7\1\65\15\7\5\0\3\7\17\0\1\66\20\7"+
    "\5\0\3\7\17\0\1\67\20\7\5\0\3\7\17\0"+
    "\15\7\1\70\3\7\5\0\3\7\17\0\10\7\1\71"+
    "\10\7\5\0\3\7\17\0\6\7\1\72\12\7\5\0"+
    "\3\7\17\0\11\7\1\73\7\7\5\0\3\7\17\0"+
    "\10\7\1\74\10\7\5\0\3\7\17\0\6\7\1\75"+
    "\12\7\5\0\3\7\17\0\4\7\1\76\14\7\5\0"+
    "\3\7\17\0\2\7\1\77\16\7\5\0\3\7\17\0"+
    "\10\7\1\100\10\7\5\0\3\7\17\0\6\7\1\101"+
    "\12\7\5\0\3\7\17\0\2\7\1\102\16\7\5\0"+
    "\3\7\17\0\7\7\1\103\11\7\5\0\3\7\17\0"+
    "\11\7\1\104\7\7\5\0\3\7\17\0\10\7\1\105"+
    "\10\7\5\0\3\7\17\0\16\7\1\106\2\7\5\0"+
    "\3\7\17\0\20\7\1\107\5\0\3\7\17\0\1\7"+
    "\1\110\17\7\5\0\3\7\17\0\4\7\1\111\14\7"+
    "\5\0\3\7\17\0\14\7\1\112\4\7\5\0\3\7"+
    "\17\0\2\7\1\113\16\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1800];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\3\1\15\11\11\1\2\11"+
    "\1\0\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 118) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Illegal character <"+yytext()+"> [Line:Column]=["+yyline+1+", "+yycolumn+1 );
          }
        case 34: break;
        case 2: 
          { System.out.print(" = "); return new Symbol(sym.ASSIGN, yyline+1, yycolumn+1);
          }
        case 35: break;
        case 3: 
          { System.out.print(yytext()); return new Symbol(sym.REL, yyline+1, yycolumn+1, new String(yytext()));
          }
        case 36: break;
        case 4: 
          { System.out.print(yytext()); return new Symbol(sym.MULDIV, yyline+1, yycolumn+1, new String(yytext()));
          }
        case 37: break;
        case 5: 
          { System.out.print(yytext()); return new Symbol(sym.ID, yyline+1, yycolumn+1, new String(yytext()));
          }
        case 38: break;
        case 6: 
          { System.out.print(yytext()); return new Symbol(sym.INTNUM, yyline+1, yycolumn+1, new Integer(yytext()));
          }
        case 39: break;
        case 7: 
          { System.out.println();
          }
        case 40: break;
        case 8: 
          { 
          }
        case 41: break;
        case 9: 
          { System.out.print(" + "); return new Symbol(sym.PLUS, yyline+1, yycolumn+1);
          }
        case 42: break;
        case 10: 
          { System.out.print(" - "); return new Symbol(sym.MINUS, yyline+1, yycolumn+1);
          }
        case 43: break;
        case 11: 
          { System.out.print(" ( "); return new Symbol(sym.LPAREN, yyline+1, yycolumn+1);
          }
        case 44: break;
        case 12: 
          { System.out.print(" ) "); return new Symbol(sym.RPAREN, yyline+1, yycolumn+1);
          }
        case 45: break;
        case 13: 
          { System.out.print(" { "); return new Symbol(sym.LCBRACKET, yyline+1, yycolumn+1);
          }
        case 46: break;
        case 14: 
          { System.out.print(" } "); return new Symbol(sym.RCBRACKET, yyline+1, yycolumn+1);
          }
        case 47: break;
        case 15: 
          { System.out.print(" [ "); return new Symbol(sym.LSBRACKET, yyline+1, yycolumn+1);
          }
        case 48: break;
        case 16: 
          { System.out.print(" ] "); return new Symbol(sym.RSBRACKET, yyline+1, yycolumn+1);
          }
        case 49: break;
        case 17: 
          { System.out.print(" , "); return new Symbol(sym.COMMA, yyline+1, yycolumn+1);
          }
        case 50: break;
        case 18: 
          { System.out.print(" ; "); return new Symbol(sym.SEMI, yyline+1, yycolumn+1);
          }
        case 51: break;
        case 19: 
          { System.out.print(" : "); return new Symbol(sym.COLON, yyline+1, yycolumn+1);
          }
        case 52: break;
        case 20: 
          { System.out.print(yytext()); return new Symbol(sym.EQ, yyline+1, yycolumn+1, new String(yytext()));
          }
        case 53: break;
        case 21: 
          { System.out.print(" if "); return new Symbol(sym.IF, yyline+1, yycolumn+1);
          }
        case 54: break;
        case 22: 
          { System.out.print(" do "); return new Symbol(sym.DO, yyline+1, yycolumn+1);
          }
        case 55: break;
        case 23: 
          { System.out.print(yytext()); return new Symbol(sym.FLOATNUM, yyline+1, yycolumn+1, new Float(yytext()));
          }
        case 56: break;
        case 24: 
          { System.out.print(" int "); return new Symbol(sym.INT, yyline+1, yycolumn+1);
          }
        case 57: break;
        case 25: 
          { System.out.print(" for "); return new Symbol(sym.FOR, yyline+1, yycolumn+1);
          }
        case 58: break;
        case 26: 
          { System.out.print(" else "); return new Symbol(sym.ELSE, yyline+1, yycolumn+1);
          }
        case 59: break;
        case 27: 
          { System.out.print(" case "); return new Symbol(sym.CASE, yyline+1, yycolumn+1);
          }
        case 60: break;
        case 28: 
          { System.out.print(" float "); return new Symbol(sym.FLOAT, yyline+1, yycolumn+1);
          }
        case 61: break;
        case 29: 
          { System.out.print(" while "); return new Symbol(sym.WHILE, yyline+1, yycolumn+1);
          }
        case 62: break;
        case 30: 
          { System.out.print(" break "); return new Symbol(sym.BREAK, yyline+1, yycolumn+1);
          }
        case 63: break;
        case 31: 
          { System.out.print(" return "); return new Symbol(sym.RETURN, yyline+1, yycolumn+1);
          }
        case 64: break;
        case 32: 
          { System.out.print(" switch "); return new Symbol(sym.SWITCH, yyline+1, yycolumn+1);
          }
        case 65: break;
        case 33: 
          { System.out.print(" default "); return new Symbol(sym.DEFAULT, yyline+1, yycolumn+1);
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}