// $ANTLR 3.3 Nov 30, 2010 12:45:30 TestSuite.g 2011-10-20 16:14:30
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.soil.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.parser.ocl.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class TestSuiteParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "COLON_COLON", "COMMA", "STRING", "LPAREN", "RPAREN", "COLON", "EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "ARROW", "DOT", "AT", "BAR", "SEMI", "LBRACK", "RBRACK", "INT", "REAL", "HASH", "LBRACE", "RBRACE", "DOTDOT", "COLON_EQUAL", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "RANGE_OR_INT", "ESC", "NON_OCL_STRING", "HEX_DIGIT", "VOCAB", "'testsuite'", "'for'", "'model'", "'setup'", "'!'", "'end'", "'testcase'", "'beginVariation'", "'endVariation'", "'assert'", "'valid'", "'invalid'", "'invs'", "'inv'", "'pre'", "'post'", "'let'", "'in'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'", "'set'", "'create'", "'assign'", "'between'", "'openter'", "'opexit'", "'execute'", "'new'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'do'", "'while'"
    };
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int IDENT=4;
    public static final int COLON_COLON=5;
    public static final int COMMA=6;
    public static final int STRING=7;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int COLON=10;
    public static final int EQUAL=11;
    public static final int NOT_EQUAL=12;
    public static final int LESS=13;
    public static final int GREATER=14;
    public static final int LESS_EQUAL=15;
    public static final int GREATER_EQUAL=16;
    public static final int PLUS=17;
    public static final int MINUS=18;
    public static final int STAR=19;
    public static final int SLASH=20;
    public static final int ARROW=21;
    public static final int DOT=22;
    public static final int AT=23;
    public static final int BAR=24;
    public static final int SEMI=25;
    public static final int LBRACK=26;
    public static final int RBRACK=27;
    public static final int INT=28;
    public static final int REAL=29;
    public static final int HASH=30;
    public static final int LBRACE=31;
    public static final int RBRACE=32;
    public static final int DOTDOT=33;
    public static final int COLON_EQUAL=34;
    public static final int NEWLINE=35;
    public static final int WS=36;
    public static final int SL_COMMENT=37;
    public static final int ML_COMMENT=38;
    public static final int RANGE_OR_INT=39;
    public static final int ESC=40;
    public static final int NON_OCL_STRING=41;
    public static final int HEX_DIGIT=42;
    public static final int VOCAB=43;

    // delegates
    // delegators


        public TestSuiteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TestSuiteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TestSuiteParser.tokenNames; }
    public String getGrammarFileName() { return "TestSuite.g"; }



    // $ANTLR start "testSuite"
    // TestSuite.g:90:1: testSuite returns [ASTTestSuite suite] : 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF ;
    public final ASTTestSuite testSuite() throws RecognitionException {
        ASTTestSuite suite = null;

        Token suiteName=null;
        String modelFile = null;

        ASTStatement c = null;

        List tests = null;



          List setupStatements = new ArrayList();

        try {
            // TestSuite.g:94:1: ( 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF )
            // TestSuite.g:95:3: 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF
            {
            match(input,44,FOLLOW_44_in_testSuite61); if (state.failed) return suite;
            suiteName=(Token)match(input,IDENT,FOLLOW_IDENT_in_testSuite71); if (state.failed) return suite;
            if ( state.backtracking==0 ) {
               suite = new ASTTestSuite(suiteName); 
            }
            match(input,45,FOLLOW_45_in_testSuite82); if (state.failed) return suite;
            match(input,46,FOLLOW_46_in_testSuite84); if (state.failed) return suite;
            pushFollow(FOLLOW_filename_in_testSuite93);
            modelFile=filename();

            state._fsp--;
            if (state.failed) return suite;
            if ( state.backtracking==0 ) {
               suite.setModelFile(suiteName); 
            }
            // TestSuite.g:101:3: ( 'setup' ( '!' c= shellCommandOnly )* 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==47) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // TestSuite.g:101:4: 'setup' ( '!' c= shellCommandOnly )* 'end'
                    {
                    match(input,47,FOLLOW_47_in_testSuite105); if (state.failed) return suite;
                    // TestSuite.g:102:4: ( '!' c= shellCommandOnly )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==48) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // TestSuite.g:102:5: '!' c= shellCommandOnly
                    	    {
                    	    match(input,48,FOLLOW_48_in_testSuite112); if (state.failed) return suite;
                    	    pushFollow(FOLLOW_shellCommandOnly_in_testSuite118);
                    	    c=shellCommandOnly();

                    	    state._fsp--;
                    	    if (state.failed) return suite;
                    	    if ( state.backtracking==0 ) {
                    	       setupStatements.add(c); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,49,FOLLOW_49_in_testSuite124); if (state.failed) return suite;
                    if ( state.backtracking==0 ) {
                       suite.setSetupStatements(setupStatements); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_testCases_in_testSuite145);
            tests=testCases();

            state._fsp--;
            if (state.failed) return suite;
            if ( state.backtracking==0 ) {
               suite.setTestCases(tests); 
            }
            match(input,EOF,FOLLOW_EOF_in_testSuite154); if (state.failed) return suite;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return suite;
    }
    // $ANTLR end "testSuite"


    // $ANTLR start "filename"
    // TestSuite.g:110:1: filename returns [String filename] : name= IDENT '.' suffix= IDENT ;
    public final String filename() throws RecognitionException {
        String filename = null;

        Token name=null;
        Token suffix=null;

        try {
            // TestSuite.g:111:1: (name= IDENT '.' suffix= IDENT )
            // TestSuite.g:112:4: name= IDENT '.' suffix= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename172); if (state.failed) return filename;
            match(input,DOT,FOLLOW_DOT_in_filename174); if (state.failed) return filename;
            suffix=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename178); if (state.failed) return filename;
            if ( state.backtracking==0 ) {
              filename = (name!=null?name.getText():null) + "." + (suffix!=null?suffix.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return filename;
    }
    // $ANTLR end "filename"


    // $ANTLR start "testCases"
    // TestSuite.g:115:1: testCases returns [List testCases] : (test= testCase )+ ;
    public final List testCases() throws RecognitionException {
        List testCases = null;

        ASTTestCase test = null;


         testCases = new ArrayList(); 
        try {
            // TestSuite.g:117:1: ( (test= testCase )+ )
            // TestSuite.g:118:3: (test= testCase )+
            {
            // TestSuite.g:118:3: (test= testCase )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==50) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // TestSuite.g:118:4: test= testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_testCases205);
            	    test=testCase();

            	    state._fsp--;
            	    if (state.failed) return testCases;
            	    if ( state.backtracking==0 ) {
            	       testCases.add(test); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return testCases;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return testCases;
    }
    // $ANTLR end "testCases"


    // $ANTLR start "testCase"
    // TestSuite.g:121:1: testCase returns [ASTTestCase n] : 'testcase' name= IDENT ( '!' c= shellCommandOnly | a= assertStatement | b= 'beginVariation' | e= 'endVariation' )* 'end' ;
    public final ASTTestCase testCase() throws RecognitionException {
        ASTTestCase n = null;

        Token name=null;
        Token b=null;
        Token e=null;
        ASTStatement c = null;

        ASTAssert a = null;


        try {
            // TestSuite.g:122:1: ( 'testcase' name= IDENT ( '!' c= shellCommandOnly | a= assertStatement | b= 'beginVariation' | e= 'endVariation' )* 'end' )
            // TestSuite.g:123:3: 'testcase' name= IDENT ( '!' c= shellCommandOnly | a= assertStatement | b= 'beginVariation' | e= 'endVariation' )* 'end'
            {
            match(input,50,FOLLOW_50_in_testCase224); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_testCase228); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTestCase(name); 
            }
            // TestSuite.g:124:3: ( '!' c= shellCommandOnly | a= assertStatement | b= 'beginVariation' | e= 'endVariation' )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    alt4=1;
                    }
                    break;
                case 53:
                    {
                    alt4=2;
                    }
                    break;
                case 51:
                    {
                    alt4=3;
                    }
                    break;
                case 52:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // TestSuite.g:125:7: '!' c= shellCommandOnly
            	    {
            	    match(input,48,FOLLOW_48_in_testCase242); if (state.failed) return n;
            	    pushFollow(FOLLOW_shellCommandOnly_in_testCase248);
            	    c=shellCommandOnly();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addStatement(c); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // TestSuite.g:127:7: a= assertStatement
            	    {
            	    pushFollow(FOLLOW_assertStatement_in_testCase267);
            	    a=assertStatement();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addStatement(a); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // TestSuite.g:129:7: b= 'beginVariation'
            	    {
            	    b=(Token)match(input,51,FOLLOW_51_in_testCase285); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addStatement(new ASTVariationStart(b)); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // TestSuite.g:131:7: e= 'endVariation'
            	    {
            	    e=(Token)match(input,52,FOLLOW_52_in_testCase303); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addStatement(new ASTVariationEnd(e)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,49,FOLLOW_49_in_testCase315); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "testCase"


    // $ANTLR start "assertStatement"
    // TestSuite.g:136:1: assertStatement returns [ASTAssert n] : s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT | pre= assertionStatementPre[s=$s, valid=valid] | post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? ;
    public final ASTAssert assertStatement() throws RecognitionException {
        ASTAssert n = null;

        Token s=null;
        Token classname=null;
        Token invname=null;
        Token msg=null;
        TestSuiteParser.expression_return exp = null;

        ASTAssertPre pre = null;

        ASTAssertPost post = null;


         boolean valid = true; 
        try {
            // TestSuite.g:138:1: (s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT | pre= assertionStatementPre[s=$s, valid=valid] | post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? )
            // TestSuite.g:139:3: s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT | pre= assertionStatementPre[s=$s, valid=valid] | post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )?
            {
            s=(Token)match(input,53,FOLLOW_53_in_assertStatement336); if (state.failed) return n;
            // TestSuite.g:140:3: ( 'valid' | 'invalid' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            else if ( (LA5_0==55) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // TestSuite.g:140:4: 'valid'
                    {
                    match(input,54,FOLLOW_54_in_assertStatement341); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       valid = true; 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:140:32: 'invalid'
                    {
                    match(input,55,FOLLOW_55_in_assertStatement347); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      valid = false; 
                    }

                    }
                    break;

            }

            // TestSuite.g:141:3: (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT | pre= assertionStatementPre[s=$s, valid=valid] | post= assertionStatementPost[s=$s, valid=valid] )
            int alt6=6;
            switch ( input.LA(1) ) {
            case IDENT:
            case STRING:
            case LPAREN:
            case PLUS:
            case MINUS:
            case AT:
            case INT:
            case REAL:
            case HASH:
            case 60:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt6=1;
                }
                break;
            case 56:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==IDENT) ) {
                    alt6=3;
                }
                else if ( (LA6_2==COMMA||(LA6_2>=48 && LA6_2<=49)||(LA6_2>=51 && LA6_2<=53)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                alt6=4;
                }
                break;
            case 58:
                {
                alt6=5;
                }
                break;
            case 59:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // TestSuite.g:142:7: exp= expression
                    {
                    pushFollow(FOLLOW_expression_in_assertStatement366);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTAssertOclExpression((exp!=null?exp.n:null).getStartToken(), input.LT(-1), valid, (exp!=null?exp.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:144:7: 'invs'
                    {
                    match(input,56,FOLLOW_56_in_assertStatement382); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTAssertGlobalInvariants(s, input.LT(-1), valid); 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:146:7: 'invs' classname= IDENT
                    {
                    match(input,56,FOLLOW_56_in_assertStatement398); if (state.failed) return n;
                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement402); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTAssertClassInvariants(s, input.LT(-1), valid, classname); 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:148:7: 'inv' classname= IDENT COLON_COLON invname= IDENT
                    {
                    match(input,57,FOLLOW_57_in_assertStatement418); if (state.failed) return n;
                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement422); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertStatement424); if (state.failed) return n;
                    invname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement428); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTAssertSingleInvariant(s, input.LT(-1), valid, classname, invname); 
                    }

                    }
                    break;
                case 5 :
                    // TestSuite.g:150:7: pre= assertionStatementPre[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPre_in_assertStatement448);
                    pre=assertionStatementPre(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = pre; 
                    }

                    }
                    break;
                case 6 :
                    // TestSuite.g:152:7: post= assertionStatementPost[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPost_in_assertStatement469);
                    post=assertionStatementPost(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = post; 
                    }

                    }
                    break;

            }

            // TestSuite.g:154:3: ( COMMA msg= STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // TestSuite.g:155:5: COMMA msg= STRING
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_assertStatement486); if (state.failed) return n;
                    msg=(Token)match(input,STRING,FOLLOW_STRING_in_assertStatement490); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setMessage(msg); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "assertStatement"


    // $ANTLR start "assertionStatementPre"
    // TestSuite.g:159:1: assertionStatementPre[Token s, boolean valid] returns [ASTAssertPre n] : 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? ;
    public final ASTAssertPre assertionStatementPre(Token s, boolean valid) throws RecognitionException {
        ASTAssertPre n = null;

        Token opName=null;
        Token name=null;
        TestSuiteParser.expression_return objExp = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:160:1: ( 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? )
            // TestSuite.g:161:3: 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )?
            {
            match(input,58,FOLLOW_58_in_assertionStatementPre513); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_assertionStatementPre517);
            objExp=expression();

            state._fsp--;
            if (state.failed) return n;
            opName=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre521); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssertPre(s, null, valid, (objExp!=null?objExp.n:null), opName); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_assertionStatementPre527); if (state.failed) return n;
            // TestSuite.g:163:5: (e= expression ( COMMA e= expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT||(LA9_0>=STRING && LA9_0<=LPAREN)||(LA9_0>=PLUS && LA9_0<=MINUS)||LA9_0==AT||(LA9_0>=INT && LA9_0<=HASH)||LA9_0==60||LA9_0==67||(LA9_0>=69 && LA9_0<=73)||(LA9_0>=77 && LA9_0<=89)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TestSuite.g:163:7: e= expression ( COMMA e= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_assertionStatementPre538);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addArg((e!=null?e.n:null)); 
                    }
                    // TestSuite.g:163:41: ( COMMA e= expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // TestSuite.g:163:43: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_assertionStatementPre544); if (state.failed) return n;
                    	    pushFollow(FOLLOW_expression_in_assertionStatementPre548);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addArg((e!=null?e.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_assertionStatementPre561); if (state.failed) return n;
            // TestSuite.g:164:10: ( COLON_COLON name= IDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLON_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // TestSuite.g:164:11: COLON_COLON name= IDENT
                    {
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertionStatementPre564); if (state.failed) return n;
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre568); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setConditionName(name); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n.setEnd(input.LT(-1)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "assertionStatementPre"


    // $ANTLR start "assertionStatementPost"
    // TestSuite.g:168:1: assertionStatementPost[Token s, boolean valid] returns [ASTAssertPost n] : 'post' (name= IDENT )? ;
    public final ASTAssertPost assertionStatementPost(Token s, boolean valid) throws RecognitionException {
        ASTAssertPost n = null;

        Token name=null;

        try {
            // TestSuite.g:169:1: ( 'post' (name= IDENT )? )
            // TestSuite.g:170:3: 'post' (name= IDENT )?
            {
            match(input,59,FOLLOW_59_in_assertionStatementPost593); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssertPost(s, null, valid); 
            }
            // TestSuite.g:171:3: (name= IDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // TestSuite.g:171:4: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPost602); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setConditionName(name); 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n.setEnd(input.LT(-1)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "assertionStatementPost"


    // $ANTLR start "expressionOnly"
    // TestSuite.g:203:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        TestSuiteParser.expression_return nExp = null;


        try {
            // TestSuite.g:204:1: (nExp= expression EOF )
            // TestSuite.g:205:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly641);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly643); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = (nExp!=null?nExp.n:null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "expressionOnly"

    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };

    // $ANTLR start "expression"
    // TestSuite.g:212:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final TestSuiteParser.expression_return expression() throws RecognitionException {
        TestSuiteParser.expression_return retval = new TestSuiteParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        TestSuiteParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // TestSuite.g:218:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // TestSuite.g:219:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // TestSuite.g:220:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==60) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TestSuite.g:221:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,60,FOLLOW_60_in_expression691); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression695); if (state.failed) return retval;
            	    // TestSuite.g:221:24: ( COLON t= type )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==COLON) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // TestSuite.g:221:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression699); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression703);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression708); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression712);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,61,FOLLOW_61_in_expression714); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	               if ( firstLet == null ) 
            	                   firstLet = nextLet;
            	               if ( prevLet != null ) 
            	                   prevLet.setInExpr(nextLet);
            	               prevLet = nextLet;
            	             
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression739);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               if ( nCndImplies != null ) {
                  	 retval.n = nCndImplies;
                       retval.n.setStartToken(tok);
                    }
                    
                    if ( prevLet != null ) { 
                       prevLet.setInExpr(retval.n);
                       retval.n = firstLet;
                       retval.n.setStartToken(tok);
                    }
                  
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "paramList"
    // TestSuite.g:249:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // TestSuite.g:251:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // TestSuite.g:252:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList772); if (state.failed) return paramList;
            // TestSuite.g:253:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // TestSuite.g:254:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList789);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // TestSuite.g:255:7: ( COMMA v= variableDeclaration )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // TestSuite.g:255:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList801); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList805);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList825); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return paramList;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "idList"
    // TestSuite.g:263:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // TestSuite.g:265:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // TestSuite.g:266:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList854); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // TestSuite.g:267:5: ( COMMA idn= IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TestSuite.g:267:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList864); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList868); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return idList;
    }
    // $ANTLR end "idList"


    // $ANTLR start "variableDeclaration"
    // TestSuite.g:275:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // TestSuite.g:276:1: (name= IDENT COLON t= type )
            // TestSuite.g:277:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration899); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration901); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration905);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableDeclaration(name, t); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"


    // $ANTLR start "conditionalImpliesExpression"
    // TestSuite.g:285:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // TestSuite.g:286:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // TestSuite.g:287:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression941);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // TestSuite.g:288:5: (op= 'implies' n1= conditionalOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==62) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // TestSuite.g:288:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,62,FOLLOW_62_in_conditionalImpliesExpression954); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression958);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"


    // $ANTLR start "conditionalOrExpression"
    // TestSuite.g:297:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // TestSuite.g:298:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // TestSuite.g:299:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1003);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // TestSuite.g:300:5: (op= 'or' n1= conditionalXOrExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==63) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TestSuite.g:300:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,63,FOLLOW_63_in_conditionalOrExpression1016); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1020);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalXOrExpression"
    // TestSuite.g:309:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // TestSuite.g:310:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // TestSuite.g:311:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1064);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // TestSuite.g:312:5: (op= 'xor' n1= conditionalAndExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==64) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // TestSuite.g:312:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,64,FOLLOW_64_in_conditionalXOrExpression1077); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1081);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // TestSuite.g:321:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // TestSuite.g:322:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // TestSuite.g:323:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1125);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // TestSuite.g:324:5: (op= 'and' n1= equalityExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==65) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TestSuite.g:324:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalAndExpression1138); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1142);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "equalityExpression"
    // TestSuite.g:333:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // TestSuite.g:335:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // TestSuite.g:336:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1190);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // TestSuite.g:337:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=EQUAL && LA21_0<=NOT_EQUAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // TestSuite.g:337:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=EQUAL && input.LA(1)<=NOT_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1219);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "equalityExpression"


    // $ANTLR start "relationalExpression"
    // TestSuite.g:347:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // TestSuite.g:349:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // TestSuite.g:350:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1268);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // TestSuite.g:351:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=LESS && LA22_0<=GREATER_EQUAL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // TestSuite.g:351:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1304);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "additiveExpression"
    // TestSuite.g:361:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // TestSuite.g:363:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // TestSuite.g:364:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1354);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // TestSuite.g:365:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS && LA23_0<=MINUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // TestSuite.g:365:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1382);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // TestSuite.g:376:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // TestSuite.g:378:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // TestSuite.g:379:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1432);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // TestSuite.g:380:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=STAR && LA24_0<=SLASH)||LA24_0==66) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TestSuite.g:380:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==66 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1464);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // TestSuite.g:392:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // TestSuite.g:394:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PLUS && LA25_0<=MINUS)||LA25_0==67) ) {
                alt25=1;
            }
            else if ( (LA25_0==IDENT||(LA25_0>=STRING && LA25_0<=LPAREN)||LA25_0==AT||(LA25_0>=INT && LA25_0<=HASH)||(LA25_0>=69 && LA25_0<=73)||(LA25_0>=77 && LA25_0<=89)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // TestSuite.g:395:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // TestSuite.g:395:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // TestSuite.g:395:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==67 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1550);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUnaryExpression(op, nUnExp); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // TestSuite.g:399:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1570);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPosExp; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "postfixExpression"
    // TestSuite.g:407:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // TestSuite.g:409:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // TestSuite.g:410:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1603);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // TestSuite.g:411:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DOT) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==IDENT) ) {
                        int LA27_4 = input.LA(3);

                        if ( (LA27_4==EOF||LA27_4==IDENT||LA27_4==COMMA||(LA27_4>=LPAREN && LA27_4<=RPAREN)||(LA27_4>=EQUAL && LA27_4<=RBRACK)||(LA27_4>=LBRACE && LA27_4<=DOTDOT)||(LA27_4>=48 && LA27_4<=49)||(LA27_4>=51 && LA27_4<=53)||(LA27_4>=60 && LA27_4<=66)||(LA27_4>=74 && LA27_4<=76)||(LA27_4>=90 && LA27_4<=92)||LA27_4==96||(LA27_4>=98 && LA27_4<=99)||LA27_4==101||LA27_4==103) ) {
                            alt27=1;
                        }


                    }
                    else if ( ((LA27_2>=69 && LA27_2<=72)) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==ARROW) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // TestSuite.g:412:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // TestSuite.g:412:6: ( ARROW | DOT )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==ARROW) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==DOT) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // TestSuite.g:412:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1621); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TestSuite.g:412:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1627); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1638);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "postfixExpression"


    // $ANTLR start "primaryExpression"
    // TestSuite.g:428:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        TestSuiteParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // TestSuite.g:429:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt30=6;
            switch ( input.LA(1) ) {
            case STRING:
            case INT:
            case REAL:
            case HASH:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt30=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt30=1;
                    }
                    break;
                case EOF:
                case IDENT:
                case COMMA:
                case LPAREN:
                case RPAREN:
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case PLUS:
                case MINUS:
                case STAR:
                case SLASH:
                case ARROW:
                case AT:
                case BAR:
                case SEMI:
                case LBRACK:
                case RBRACK:
                case LBRACE:
                case RBRACE:
                case DOTDOT:
                case 48:
                case 49:
                case 51:
                case 52:
                case 53:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 74:
                case 75:
                case 76:
                case 90:
                case 91:
                case 92:
                case 96:
                case 98:
                case 99:
                case 101:
                case 103:
                    {
                    alt30=3;
                    }
                    break;
                case DOT:
                    {
                    int LA30_7 = input.LA(3);

                    if ( (LA30_7==68) ) {
                        alt30=6;
                    }
                    else if ( (LA30_7==IDENT||(LA30_7>=69 && LA30_7<=72)) ) {
                        alt30=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt30=2;
                }
                break;
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt30=3;
                }
                break;
            case LPAREN:
                {
                alt30=4;
                }
                break;
            case 73:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // TestSuite.g:430:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1678);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:431:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1692);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:432:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1704);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:433:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1715); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression1719);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1721); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // TestSuite.g:434:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1733);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // TestSuite.g:435:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1745); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1747); if (state.failed) return n;
                    match(input,68,FOLLOW_68_in_primaryExpression1749); if (state.failed) return n;
                    // TestSuite.g:435:36: ( LPAREN RPAREN )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==LPAREN) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // TestSuite.g:435:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1753); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1755); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // TestSuite.g:437:7: ( AT 'pre' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // TestSuite.g:437:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1776); if (state.failed) return n;
                            match(input,58,FOLLOW_58_in_primaryExpression1778); if (state.failed) return n;
                            if ( state.backtracking==0 ) {
                               n.setIsPre(); 
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "objectReference"
    // TestSuite.g:441:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // TestSuite.g:442:1: ( AT objectName= IDENT )
            // TestSuite.g:443:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1805); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1813); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTObjectReferenceExpression(objectName); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "objectReference"


    // $ANTLR start "propertyCall"
    // TestSuite.g:457:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        TestSuiteParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // TestSuite.g:458:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt31=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA31_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                alt31=2;
                }
                break;
            case 70:
            case 71:
            case 72:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // TestSuite.g:462:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall1878);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:465:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1891);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:466:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1904);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:467:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1917);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpType; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "propertyCall"


    // $ANTLR start "queryExpression"
    // TestSuite.g:476:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        TestSuiteParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // TestSuite.g:477:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // TestSuite.g:478:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1952); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1959); if (state.failed) return n;
            // TestSuite.g:480:5: (decls= elemVarsDeclaration BAR )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==COMMA||LA32_1==COLON||LA32_1==BAR) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // TestSuite.g:480:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1970);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression1974); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression1985);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1991); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "queryExpression"


    // $ANTLR start "iterateExpression"
    // TestSuite.g:494:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        TestSuiteParser.expression_return nExp = null;


        try {
            // TestSuite.g:494:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // TestSuite.g:495:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,69,FOLLOW_69_in_iterateExpression2023); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2029); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2037);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2039); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2047);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression2049); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression2057);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2063); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "iterateExpression"

    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };

    // $ANTLR start "operationExpression"
    // TestSuite.g:516:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final TestSuiteParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        TestSuiteParser.operationExpression_return retval = new TestSuiteParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        TestSuiteParser.expression_return rolename = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:518:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // TestSuite.g:519:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2107); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // TestSuite.g:525:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LBRACK) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // TestSuite.g:525:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2129); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression2142);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // TestSuite.g:527:9: ( COMMA rolename= expression )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // TestSuite.g:527:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2155); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression2159);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2171); if (state.failed) return retval;
                    // TestSuite.g:530:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==LBRACK) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // TestSuite.g:530:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2188); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression2203);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // TestSuite.g:532:11: ( COMMA rolename= expression )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==COMMA) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // TestSuite.g:532:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2218); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression2222);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2236); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // TestSuite.g:537:5: ( AT 'pre' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // TestSuite.g:537:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2261); if (state.failed) return retval;
                    match(input,58,FOLLOW_58_in_operationExpression2263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // TestSuite.g:538:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LPAREN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // TestSuite.g:539:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // TestSuite.g:540:7: (e= expression ( COMMA e= expression )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==IDENT||(LA39_0>=STRING && LA39_0<=LPAREN)||(LA39_0>=PLUS && LA39_0<=MINUS)||LA39_0==AT||(LA39_0>=INT && LA39_0<=HASH)||LA39_0==60||LA39_0==67||(LA39_0>=69 && LA39_0<=73)||(LA39_0>=77 && LA39_0<=89)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // TestSuite.g:541:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2304);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // TestSuite.g:542:7: ( COMMA e= expression )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==COMMA) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // TestSuite.g:542:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2316); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression2320);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2340); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               retval.n.setStartToken(((Token)retval.start)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationExpression"


    // $ANTLR start "typeExpression"
    // TestSuite.g:555:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // TestSuite.g:558:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // TestSuite.g:559:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=70 && input.LA(1)<=72) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2405); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression2409);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2411); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTypeArgExpression(opToken, source, t, followsArrow); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "typeExpression"


    // $ANTLR start "elemVarsDeclaration"
    // TestSuite.g:570:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        Token var1=null;
        Token varN=null;
        ASTType t = null;

        ASTType tN = null;


        try {
            // TestSuite.g:571:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // TestSuite.g:572:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) {
               n = new ASTElemVarsDeclaration(); 
            }
            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2449); if (state.failed) return n;
            // TestSuite.g:573:17: ( COLON t= type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==COLON) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // TestSuite.g:573:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2452); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2456);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              n.addDeclaration(var1, t);
            }
            // TestSuite.g:574:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // TestSuite.g:574:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2466); if (state.failed) return n;
            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2472); if (state.failed) return n;
            	    // TestSuite.g:574:24: ( COLON tN= type )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==COLON) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // TestSuite.g:574:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2475); if (state.failed) return n;
            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2481);
            	            tN=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	      n.addDeclaration(varN, tN); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"


    // $ANTLR start "variableInitialization"
    // TestSuite.g:582:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:583:1: (name= IDENT COLON t= type EQUAL e= expression )
            // TestSuite.g:584:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2509); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization2511); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization2515);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2517); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization2521);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "variableInitialization"


    // $ANTLR start "ifExpression"
    // TestSuite.g:593:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        TestSuiteParser.expression_return cond = null;

        TestSuiteParser.expression_return t = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:594:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // TestSuite.g:595:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,73,FOLLOW_73_in_ifExpression2553); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2557);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,74,FOLLOW_74_in_ifExpression2559); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2563);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,75,FOLLOW_75_in_ifExpression2565); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2569);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,76,FOLLOW_76_in_ifExpression2571); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "ifExpression"


    // $ANTLR start "literal"
    // TestSuite.g:615:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;

        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        ASTCollectionLiteral nColIt = null;

        ASTEmptyCollectionLiteral nEColIt = null;

        ASTUndefinedLiteral nUndLit = null;

        ASTTupleLiteral nTupleLit = null;

        ASTDateLiteral nDateLit = null;


        try {
            // TestSuite.g:616:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt44=12;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // TestSuite.g:617:7: t= 'true'
                    {
                    t=(Token)match(input,77,FOLLOW_77_in_literal2610); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:618:7: f= 'false'
                    {
                    f=(Token)match(input,78,FOLLOW_78_in_literal2624); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:619:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2637); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:620:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2652); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // TestSuite.g:621:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2666); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // TestSuite.g:622:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2676); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2680); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // TestSuite.g:623:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2692); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2694); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2698); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // TestSuite.g:624:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2710);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // TestSuite.g:625:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2722);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // TestSuite.g:626:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2734);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // TestSuite.g:627:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2746);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // TestSuite.g:628:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal2758);
                    nDateLit=dateLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nDateLit; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "literal"


    // $ANTLR start "collectionLiteral"
    // TestSuite.g:636:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // TestSuite.g:638:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // TestSuite.g:639:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=79 && input.LA(1)<=82) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               n = new ASTCollectionLiteral(op); 
            }
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2825); if (state.failed) return n;
            // TestSuite.g:643:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT||(LA46_0>=STRING && LA46_0<=LPAREN)||(LA46_0>=PLUS && LA46_0<=MINUS)||LA46_0==AT||(LA46_0>=INT && LA46_0<=HASH)||LA46_0==60||LA46_0==67||(LA46_0>=69 && LA46_0<=73)||(LA46_0>=77 && LA46_0<=89)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // TestSuite.g:644:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2842);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // TestSuite.g:645:7: ( COMMA ci= collectionItem )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // TestSuite.g:645:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2855); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2859);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2878); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"


    // $ANTLR start "collectionItem"
    // TestSuite.g:654:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        TestSuiteParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // TestSuite.g:656:1: (e= expression ( DOTDOT e= expression )? )
            // TestSuite.g:657:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2907);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // TestSuite.g:658:5: ( DOTDOT e= expression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DOTDOT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // TestSuite.g:658:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2918); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem2922);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setSecond((e!=null?e.n:null)); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionItem"


    // $ANTLR start "emptyCollectionLiteral"
    // TestSuite.g:668:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // TestSuite.g:669:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==83) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=79 && LA48_0<=82)||LA48_0==89) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // TestSuite.g:670:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,83,FOLLOW_83_in_emptyCollectionLiteral2951); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2953); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2957);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2959); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:673:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2975);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2977); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2979); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"


    // $ANTLR start "undefinedLiteral"
    // TestSuite.g:684:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // TestSuite.g:685:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt49=1;
                }
                break;
            case 85:
                {
                alt49=2;
                }
                break;
            case 86:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==LPAREN) ) {
                    alt49=3;
                }
                else if ( (LA49_3==EOF||LA49_3==IDENT||LA49_3==COMMA||LA49_3==RPAREN||(LA49_3>=EQUAL && LA49_3<=DOT)||(LA49_3>=BAR && LA49_3<=SEMI)||LA49_3==RBRACK||(LA49_3>=LBRACE && LA49_3<=DOTDOT)||(LA49_3>=48 && LA49_3<=49)||(LA49_3>=51 && LA49_3<=53)||(LA49_3>=60 && LA49_3<=66)||(LA49_3>=74 && LA49_3<=76)||(LA49_3>=90 && LA49_3<=92)||LA49_3==96||(LA49_3>=98 && LA49_3<=99)||LA49_3==101||LA49_3==103) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // TestSuite.g:686:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,84,FOLLOW_84_in_undefinedLiteral3009); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3011); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral3015);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3017); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:689:5: 'Undefined'
                    {
                    match(input,85,FOLLOW_85_in_undefinedLiteral3031); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:692:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3045); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3047); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral3051);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3053); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:695:5: 'null'
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3067); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"


    // $ANTLR start "tupleLiteral"
    // TestSuite.g:705:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // TestSuite.g:707:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // TestSuite.g:708:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,87,FOLLOW_87_in_tupleLiteral3106); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3112); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3120);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // TestSuite.g:711:5: ( COMMA ti= tupleItem )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // TestSuite.g:711:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3131); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3135);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3146); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTupleLiteral(tiList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"


    // $ANTLR start "tupleItem"
    // TestSuite.g:719:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:720:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // TestSuite.g:721:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3177); if (state.failed) return n;
            // TestSuite.g:722:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred1_TestSuite()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==EQUAL) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // TestSuite.g:725:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3216); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem3220);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3222); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem3226);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:728:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( (input.LA(1)>=COLON && input.LA(1)<=EQUAL) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_tupleItem3258);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleItem"


    // $ANTLR start "dateLiteral"
    // TestSuite.g:737:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // TestSuite.g:738:1: ( 'Date' LBRACE v= STRING RBRACE )
            // TestSuite.g:739:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,88,FOLLOW_88_in_dateLiteral3303); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral3305); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral3309); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral3311); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTDateLiteral( v ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "dateLiteral"


    // $ANTLR start "type"
    // TestSuite.g:749:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // TestSuite.g:751:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // TestSuite.g:752:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // TestSuite.g:753:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt52=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt52=1;
                }
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 89:
                {
                alt52=2;
                }
                break;
            case 87:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // TestSuite.g:754:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3361);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:755:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3373);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:756:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3385);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTTuple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeOnly"
    // TestSuite.g:761:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // TestSuite.g:762:1: (nT= type EOF )
            // TestSuite.g:763:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3417);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly3419); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nT; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "typeOnly"


    // $ANTLR start "simpleType"
    // TestSuite.g:773:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // TestSuite.g:774:1: (name= IDENT )
            // TestSuite.g:775:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3447); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTSimpleType(name); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "simpleType"


    // $ANTLR start "collectionType"
    // TestSuite.g:783:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // TestSuite.g:785:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // TestSuite.g:786:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=79 && input.LA(1)<=82)||input.LA(1)==89 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3512); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType3516);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3518); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTCollectionType(op, elemType); if (n != null) n.setStartToken(op);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionType"


    // $ANTLR start "tupleType"
    // TestSuite.g:796:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // TestSuite.g:798:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // TestSuite.g:799:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,87,FOLLOW_87_in_tupleType3552); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3554); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType3563);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // TestSuite.g:801:5: ( COMMA tp= tuplePart )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // TestSuite.g:801:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3574); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType3578);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3590); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTupleType(tpList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleType"


    // $ANTLR start "tuplePart"
    // TestSuite.g:810:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // TestSuite.g:811:1: (name= IDENT COLON t= type )
            // TestSuite.g:812:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3622); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart3624); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart3628);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTuplePart(name, t); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tuplePart"


    // $ANTLR start "shellCommandOnly"
    // TestSuite.g:819:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;

        TestSuiteParser.stat_return s = null;

        TestSuiteParser.legacyStat_return l = null;


        try {
            // TestSuite.g:820:1: ( ( stat )=>s= stat | l= legacyStat )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // TestSuite.g:821:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly3665);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (s!=null?s.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:824:3: l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly3681);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (l!=null?l.n:null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "shellCommandOnly"


    // $ANTLR start "shellCommand"
    // TestSuite.g:832:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;

        TestSuiteParser.legacyStat_return l = null;

        TestSuiteParser.stat_return s = null;


        try {
            // TestSuite.g:833:1: ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // TestSuite.g:834:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand3713);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EOF,FOLLOW_EOF_in_shellCommand3715); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (l!=null?l.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:837:3: s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand3731);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EOF,FOLLOW_EOF_in_shellCommand3733); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (s!=null?s.n:null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "shellCommand"

    public static class legacyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyStat"
    // TestSuite.g:847:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter | lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final TestSuiteParser.legacyStat_return legacyStat() throws RecognitionException {
        TestSuiteParser.legacyStat_return retval = new TestSuiteParser.legacyStat_return();
        retval.start = input.LT(1);

        ASTEnterOperationStatement loe = null;

        ASTStatement lox = null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:851:1: (loe= legacyOpEnter | lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt57=1;
                }
                break;
            case 95:
                {
                alt57=2;
                }
                break;
            case 60:
            case 90:
            case 91:
            case 92:
            case 96:
            case 98:
            case 99:
            case 101:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // TestSuite.g:852:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat3767);
                    loe=legacyOpEnter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          retval.n = loe;
                          if (retval.n != null) {
                            retval.n.setSourcePosition(((Token)retval.start));
                          }
                        
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:860:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat3783);
                    lox=legacyOpExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          retval.n = lox; 
                          if (retval.n != null) {
                            retval.n.setSourcePosition(((Token)retval.start));
                          }
                        
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:868:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3796);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;
                    // TestSuite.g:869:3: ( nextLegacyStat[seq] )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==60||(LA56_0>=90 && LA56_0<=92)||LA56_0==96||(LA56_0>=98 && LA56_0<=99)||LA56_0==101) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // TestSuite.g:870:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3807);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                          retval.n = seq.simplify();
                          retval.n.setSourcePosition(((Token)retval.start));
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "legacyStat"

    public static class nextLegacyStat_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nextLegacyStat"
    // TestSuite.g:883:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final TestSuiteParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextLegacyStat_return retval = new TestSuiteParser.nextLegacyStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // TestSuite.g:884:1: (s= singleLegacyStat ( SEMI )? )
            // TestSuite.g:885:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat3841);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;
            // TestSuite.g:886:3: ( SEMI )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==SEMI) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // TestSuite.g:886:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat3845); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if ((s != null) && (!s.isEmptyStatement())) { 
                    seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                  }
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nextLegacyStat"


    // $ANTLR start "singleLegacyStat"
    // TestSuite.g:899:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;

        TestSuiteParser.legacyCreate_return lcr = null;

        TestSuiteParser.legacyCreateAssign_return lca = null;

        TestSuiteParser.legacyCreateInsert_return lci = null;

        ASTVariableAssignmentStatement llt = null;

        ASTStatement lex = null;

        TestSuiteParser.objDestroyStat_return ods = null;

        TestSuiteParser.expression_return e = null;

        ASTAttributeAssignmentStatement aas = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;


        try {
            // TestSuite.g:900:1: (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat )
            int alt59=9;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // TestSuite.g:901:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat3878);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lcr!=null?lcr.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:902:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat3897);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lca!=null?lca.n:null); 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:903:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat3910);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lci!=null?lci.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:904:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat3923);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = llt; 
                    }

                    }
                    break;
                case 5 :
                    // TestSuite.g:907:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat3951);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lex; 
                    }

                    }
                    break;
                case 6 :
                    // TestSuite.g:908:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat3969);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 7 :
                    // TestSuite.g:909:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,90,FOLLOW_90_in_singleLegacyStat3982); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_singleLegacyStat3986);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat3992);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = aas; 
                    }

                    }
                    break;
                case 8 :
                    // TestSuite.g:910:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat4005);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 9 :
                    // TestSuite.g:911:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat4026);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "singleLegacyStat"

    public static class legacyCreate_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyCreate"
    // TestSuite.g:924:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final TestSuiteParser.legacyCreate_return legacyCreate() throws RecognitionException {
        TestSuiteParser.legacyCreate_return retval = new TestSuiteParser.legacyCreate_return();
        retval.start = input.LT(1);

        List<String> objNames = null;

        ASTSimpleType objType = null;


        try {
            // TestSuite.g:925:1: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // TestSuite.g:926:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,91,FOLLOW_91_in_legacyCreate4062); if (state.failed) return retval;
            pushFollow(FOLLOW_identListMin1_in_legacyCreate4070);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;
            match(input,COLON,FOLLOW_COLON_in_legacyCreate4074); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreate4082);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               
                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (String objName : objNames) {
                    seq.addStatement(
                      new ASTNewObjectStatement(
                        objType, 
                        new ASTStringLiteral(objName)), 
                      ((Token)retval.start),
                      input.toString(retval.start,input.LT(-1)));
                  }
                  
                  retval.n = seq.simplify();
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "legacyCreate"

    public static class legacyCreateAssign_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyCreateAssign"
    // TestSuite.g:958:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final TestSuiteParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        TestSuiteParser.legacyCreateAssign_return retval = new TestSuiteParser.legacyCreateAssign_return();
        retval.start = input.LT(1);

        List<String> varNames = null;

        ASTSimpleType objType = null;


        try {
            // TestSuite.g:959:1: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // TestSuite.g:960:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,92,FOLLOW_92_in_legacyCreateAssign4119); if (state.failed) return retval;
            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign4127);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign4131); if (state.failed) return retval;
            match(input,91,FOLLOW_91_in_legacyCreateAssign4135); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign4143);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (String varName : varNames) {
                    seq.addStatement(
                      new ASTVariableAssignmentStatement(
                        varName, 
                        new ASTRValueNewObject(objType)),
                      ((Token)retval.start),
                      input.toString(retval.start,input.LT(-1)));
                  }
                  
                  retval.n = seq.simplify();
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "legacyCreateAssign"

    public static class legacyCreateInsert_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };

    // $ANTLR start "legacyCreateInsert"
    // TestSuite.g:994:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final TestSuiteParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        TestSuiteParser.legacyCreateInsert_return retval = new TestSuiteParser.legacyCreateInsert_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTSimpleType asClassName = null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return participants = null;


        try {
            // TestSuite.g:995:1: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // TestSuite.g:996:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,91,FOLLOW_91_in_legacyCreateInsert4177); if (state.failed) return retval;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert4185); if (state.failed) return retval;
            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert4189); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert4197);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            match(input,93,FOLLOW_93_in_legacyCreateInsert4201); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert4205); if (state.failed) return retval;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4215);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert4219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTNewLinkObjectStatement nlo = 
                    new ASTNewLinkObjectStatement(
                      asClassName, 
                      (participants!=null?participants.participans:null),
                      (participants!=null?participants.qualifiers:null),
                      new ASTStringLiteral(name));
                      
                  nlo.setSourcePosition(((Token)retval.start));
                
                  retval.n = new ASTVariableAssignmentStatement(
                    (name!=null?name.getText():null),
                    new ASTRValueNewLinkObject(nlo));
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "legacyCreateInsert"


    // $ANTLR start "legacyLet"
    // TestSuite.g:1032:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;

        Token varName=null;
        ASTType varType = null;

        ASTExpression e = null;


        try {
            // TestSuite.g:1033:1: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // TestSuite.g:1034:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,60,FOLLOW_60_in_legacyLet4252); if (state.failed) return n;
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet4260); if (state.failed) return n;
            // TestSuite.g:1036:3: ( COLON varType= type )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COLON) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // TestSuite.g:1037:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet4270); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_legacyLet4280);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet4289); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_legacyLet4297);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), e, varType); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "legacyLet"


    // $ANTLR start "legacyOpEnter"
    // TestSuite.g:1058:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;

        Token op=null;
        ASTExpression obj = null;

        List<ASTExpression> args = null;


        try {
            // TestSuite.g:1059:1: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // TestSuite.g:1060:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,94,FOLLOW_94_in_legacyOpEnter4330); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter4338);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter4346); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter4350); if (state.failed) return n;
            pushFollow(FOLLOW_exprList_in_legacyOpEnter4360);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter4364); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTEnterOperationStatement(obj, (op!=null?op.getText():null), args); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "legacyOpEnter"


    // $ANTLR start "legacyOpExit"
    // TestSuite.g:1083:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression retVal = null;


        try {
            // TestSuite.g:1084:1: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // TestSuite.g:1085:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,95,FOLLOW_95_in_legacyOpExit4399); if (state.failed) return n;
            // TestSuite.g:1085:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // TestSuite.g:1085:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit4411);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // TestSuite.g:1085:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit4415);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTExitOperationStatement(retVal); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "legacyOpExit"


    // $ANTLR start "legacyExecute"
    // TestSuite.g:1100:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;

        try {
            // TestSuite.g:1101:1: ( 'execute' expression )
            // TestSuite.g:1102:3: 'execute' expression
            {
            match(input,96,FOLLOW_96_in_legacyExecute4448); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_legacyExecute4452);
            expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               
                  reportWarning("the execute command is not supported in this version"); 
                  n = new ASTEmptyStatement();
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "legacyExecute"


    // $ANTLR start "statOnly"
    // TestSuite.g:1146:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        TestSuiteParser.stat_return s = null;


        try {
            // TestSuite.g:1147:1: (s= stat EOF )
            // TestSuite.g:1148:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly4498);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly4502); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = (s!=null?s.n:null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "statOnly"

    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "stat"
    // TestSuite.g:1158:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final TestSuiteParser.stat_return stat() throws RecognitionException {
        TestSuiteParser.stat_return retval = new TestSuiteParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:1162:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // TestSuite.g:1163:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat4533);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // TestSuite.g:1164:3: ( SEMI nextStat[seq] )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==SEMI) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // TestSuite.g:1165:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat4544); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat4550);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                  retval.n = seq.simplify();
                  if ((retval.n != null) && (!retval.n.isEmptyStatement())) {
                    retval.n.setSourcePosition(((Token)retval.start));
                  }
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class nextStat_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nextStat"
    // TestSuite.g:1181:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final TestSuiteParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextStat_return retval = new TestSuiteParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // TestSuite.g:1182:1: (s= singleStat )
            // TestSuite.g:1183:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat4584);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  if ((s != null) && (!s.isEmptyStatement())) {
                    seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                  }
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nextStat"


    // $ANTLR start "singleStat"
    // TestSuite.g:1195:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        TestSuiteParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // TestSuite.g:1199:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt63=10;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // TestSuite.g:1200:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4621);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1202:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4647);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // TestSuite.g:1203:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4659);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // TestSuite.g:1204:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4673);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // TestSuite.g:1205:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4687);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // TestSuite.g:1206:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4700);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // TestSuite.g:1207:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4717);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // TestSuite.g:1208:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4734);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // TestSuite.g:1209:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4751);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // TestSuite.g:1211:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4773);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = whs; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "singleStat"


    // $ANTLR start "emptyStat"
    // TestSuite.g:1218:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // TestSuite.g:1219:1: ( nothing )
            // TestSuite.g:1220:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4800);
            nothing();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTEmptyStatement(); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "emptyStat"


    // $ANTLR start "statStartingWithExpr"
    // TestSuite.g:1225:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // TestSuite.g:1226:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // TestSuite.g:1227:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4826);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // TestSuite.g:1228:3: (aas= attAssignStat[$expr.n] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // TestSuite.g:1229:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4840);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = aas; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if (aas == null) {
                    n = new ASTOperationCallStatement(expr); 
                  }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "statStartingWithExpr"


    // $ANTLR start "varAssignStat"
    // TestSuite.g:1241:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        TestSuiteParser.rValue_return rVal = null;


        try {
            // TestSuite.g:1242:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // TestSuite.g:1243:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4878); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4882); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat4890);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {

                  n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), (rVal!=null?rVal.n:null));
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "varAssignStat"


    // $ANTLR start "attAssignStat"
    // TestSuite.g:1311:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        TestSuiteParser.rValue_return r = null;


        try {
            // TestSuite.g:1312:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // TestSuite.g:1313:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4921); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4930); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4934); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat4942);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAttributeAssignmentStatement(exp, (attName!=null?attName.getText():null), (r!=null?r.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "attAssignStat"


    // $ANTLR start "objCreateStat"
    // TestSuite.g:1325:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // TestSuite.g:1326:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // TestSuite.g:1327:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,97,FOLLOW_97_in_objCreateStat4968); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat4976);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // TestSuite.g:1329:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LPAREN) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // TestSuite.g:1330:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4986); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4998);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5004); if (state.failed) return n;

                    }
                    break;

            }

            // TestSuite.g:1335:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==93) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // TestSuite.g:1336:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,93,FOLLOW_93_in_objCreateStat5022); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5030); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5044);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5052); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       
                          n = new ASTNewLinkObjectStatement(ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if (n == null) {
                    n = new ASTNewObjectStatement(ident, objName);
                  }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "objCreateStat"

    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "objDestroyStat"
    // TestSuite.g:1355:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final TestSuiteParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        TestSuiteParser.objDestroyStat_return retval = new TestSuiteParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // TestSuite.g:1356:1: ( 'destroy' el= exprListMin1 )
            // TestSuite.g:1357:3: 'destroy' el= exprListMin1
            {
            match(input,98,FOLLOW_98_in_objDestroyStat5088); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat5096);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (ASTExpression expression : el) {
                    seq.addStatement(
                      new ASTObjectDestructionStatement(expression),
                      ((Token)retval.start),
                      input.toString(retval.start,input.LT(-1)));
                  }
                  
                  retval.n = seq.simplify();
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objDestroyStat"


    // $ANTLR start "lnkInsStat"
    // TestSuite.g:1378:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // TestSuite.g:1379:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // TestSuite.g:1380:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,99,FOLLOW_99_in_lnkInsStat5122); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat5126); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5136);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat5140); if (state.failed) return n;
            match(input,100,FOLLOW_100_in_lnkInsStat5144); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat5152); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTLinkInsertionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "lnkInsStat"

    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };

    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // TestSuite.g:1390:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final TestSuiteParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return retval = new TestSuiteParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        TestSuiteParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // TestSuite.g:1396:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // TestSuite.g:1397:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5181);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // TestSuite.g:1398:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LBRACE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // TestSuite.g:1399:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5192); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5201);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5208); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5224); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5235);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // TestSuite.g:1411:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LBRACE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // TestSuite.g:1412:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5246); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5255);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5262); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // TestSuite.g:1421:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // TestSuite.g:1422:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5284); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5299);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // TestSuite.g:1426:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==LBRACE) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // TestSuite.g:1427:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5319); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5330);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5339); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            retval.qualifiers.add(currentQualifiers);
            	            currentQualifiers = Collections.emptyList();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rValListMin2WithOptionalQualifiers"


    // $ANTLR start "lnkDelStat"
    // TestSuite.g:1442:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // TestSuite.g:1443:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // TestSuite.g:1444:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,101,FOLLOW_101_in_lnkDelStat5380); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5384); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5394);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5398); if (state.failed) return n;
            match(input,102,FOLLOW_102_in_lnkDelStat5402); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5411); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTLinkDeletionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "lnkDelStat"


    // $ANTLR start "condExStat"
    // TestSuite.g:1458:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        TestSuiteParser.stat_return ts = null;

        TestSuiteParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // TestSuite.g:1462:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // TestSuite.g:1463:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,73,FOLLOW_73_in_condExStat5442); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat5451);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,74,FOLLOW_74_in_condExStat5455); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat5464);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // TestSuite.g:1467:3: ( 'else' es= stat )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==75) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // TestSuite.g:1468:5: 'else' es= stat
                    {
                    match(input,75,FOLLOW_75_in_condExStat5475); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat5487);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,49,FOLLOW_49_in_condExStat5498); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTConditionalExecutionStatement(con, (ts!=null?ts.n:null), elseStat); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "condExStat"


    // $ANTLR start "iterStat"
    // TestSuite.g:1479:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        TestSuiteParser.stat_return s = null;


        try {
            // TestSuite.g:1480:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // TestSuite.g:1481:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,45,FOLLOW_45_in_iterStat5523); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5531); if (state.failed) return n;
            match(input,61,FOLLOW_61_in_iterStat5535); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat5543);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,103,FOLLOW_103_in_iterStat5547); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat5555);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,49,FOLLOW_49_in_iterStat5559); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIterationStatement((var!=null?var.getText():null), set, (s!=null?s.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "iterStat"


    // $ANTLR start "whileStat"
    // TestSuite.g:1496:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        TestSuiteParser.stat_return s = null;


        try {
            // TestSuite.g:1497:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // TestSuite.g:1498:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,104,FOLLOW_104_in_whileStat5585); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat5593);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,103,FOLLOW_103_in_whileStat5597); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat5605);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,49,FOLLOW_49_in_whileStat5609); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTWhileStatement(cond, (s!=null?s.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "whileStat"


    // $ANTLR start "nothing"
    // TestSuite.g:1521:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // TestSuite.g:1522:1: ()
            // TestSuite.g:1523:1: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nothing"

    public static class rValue_return extends ParserRuleReturnScope {
        public ASTRValue n;
    };

    // $ANTLR start "rValue"
    // TestSuite.g:1529:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final TestSuiteParser.rValue_return rValue() throws RecognitionException {
        TestSuiteParser.rValue_return retval = new TestSuiteParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // TestSuite.g:1530:1: (e= inSoilExpression | oc= objCreateStat )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==IDENT||(LA72_0>=STRING && LA72_0<=LPAREN)||(LA72_0>=PLUS && LA72_0<=MINUS)||LA72_0==AT||(LA72_0>=INT && LA72_0<=HASH)||LA72_0==60||LA72_0==67||(LA72_0>=69 && LA72_0<=73)||(LA72_0>=77 && LA72_0<=89)) ) {
                alt72=1;
            }
            else if ( (LA72_0==97) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // TestSuite.g:1531:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5662);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1532:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5674);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          oc.setSourcePosition(((Token)retval.start));
                          if (oc instanceof ASTNewLinkObjectStatement)
                          	retval.n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)oc);
                          else
                          	retval.n = new ASTRValueNewObject((ASTNewObjectStatement)oc);
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rValue"


    // $ANTLR start "rValList"
    // TestSuite.g:1546:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // TestSuite.g:1547:1: ( nothing | rl= rValListMin1 )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RBRACE) ) {
                alt73=1;
            }
            else if ( (LA73_0==IDENT||(LA73_0>=STRING && LA73_0<=LPAREN)||(LA73_0>=PLUS && LA73_0<=MINUS)||LA73_0==AT||(LA73_0>=INT && LA73_0<=HASH)||LA73_0==60||LA73_0==67||(LA73_0>=69 && LA73_0<=73)||(LA73_0>=77 && LA73_0<=89)||LA73_0==97) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // TestSuite.g:1548:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5697);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1551:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5724);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = rl; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValList"


    // $ANTLR start "rValListMin1"
    // TestSuite.g:1559:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        TestSuiteParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1563:1: (r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1564:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15757);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // TestSuite.g:1566:3: ( COMMA r= rValue )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // TestSuite.g:1567:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15771); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin15781);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValListMin1"


    // $ANTLR start "rValListMin2"
    // TestSuite.g:1577:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        TestSuiteParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1581:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1582:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25820);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25828); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin25836);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // TestSuite.g:1587:3: ( COMMA r= rValue )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // TestSuite.g:1588:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25850); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin25860);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValListMin2"


    // $ANTLR start "inSoilExpression"
    // TestSuite.g:1598:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        TestSuiteParser.expression_return e = null;


        try {
            // TestSuite.g:1599:1: (e= expression )
            // TestSuite.g:1600:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression5894);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); 
            }
            if ( state.backtracking==0 ) {
               n = (e!=null?e.n:null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "inSoilExpression"


    // $ANTLR start "exprList"
    // TestSuite.g:1609:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // TestSuite.g:1610:1: ( nothing | el= exprListMin1 )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RPAREN) ) {
                alt76=1;
            }
            else if ( (LA76_0==IDENT||(LA76_0>=STRING && LA76_0<=LPAREN)||(LA76_0>=PLUS && LA76_0<=MINUS)||LA76_0==AT||(LA76_0>=INT && LA76_0<=HASH)||LA76_0==60||LA76_0==67||(LA76_0>=69 && LA76_0<=73)||(LA76_0>=77 && LA76_0<=89)) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // TestSuite.g:1611:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList5923);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1614:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList5941);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = el; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "exprListMin1"
    // TestSuite.g:1622:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1626:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1627:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin15974);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // TestSuite.g:1629:3: ( COMMA e= inSoilExpression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==COMMA) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // TestSuite.g:1630:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin15989); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin15999);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprListMin1"


    // $ANTLR start "exprListMin2"
    // TestSuite.g:1640:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1644:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1645:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26039);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin26047); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26055);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // TestSuite.g:1650:3: ( COMMA e= inSoilExpression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // TestSuite.g:1651:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin26069); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin26079);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprListMin2"


    // $ANTLR start "identList"
    // TestSuite.g:1661:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // TestSuite.g:1662:1: ( nothing | il= identListMin1 )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EOF||LA79_0==RPAREN||LA79_0==SEMI||LA79_0==RBRACE||(LA79_0>=48 && LA79_0<=49)||(LA79_0>=51 && LA79_0<=53)||LA79_0==75) ) {
                alt79=1;
            }
            else if ( (LA79_0==IDENT) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // TestSuite.g:1663:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList6109);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1666:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList6126);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = il; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "identList"


    // $ANTLR start "identListMin1"
    // TestSuite.g:1674:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // TestSuite.g:1678:1: (id= IDENT ( COMMA id= IDENT )* )
            // TestSuite.g:1679:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16160); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // TestSuite.g:1681:3: ( COMMA id= IDENT )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // TestSuite.g:1682:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin16174); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16184); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_TestSuite
    public final void synpred1_TestSuite_fragment() throws RecognitionException {   
        // TestSuite.g:725:7: ( COLON type EQUAL )
        // TestSuite.g:725:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_TestSuite3207); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_TestSuite3209);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_TestSuite3211); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_TestSuite

    // $ANTLR start synpred2_TestSuite
    public final void synpred2_TestSuite_fragment() throws RecognitionException {   
        // TestSuite.g:821:3: ( stat )
        // TestSuite.g:821:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred2_TestSuite3657);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_TestSuite

    // $ANTLR start synpred3_TestSuite
    public final void synpred3_TestSuite_fragment() throws RecognitionException {   
        // TestSuite.g:834:3: ( legacyStat )
        // TestSuite.g:834:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_TestSuite3705);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_TestSuite

    // $ANTLR start synpred4_TestSuite
    public final void synpred4_TestSuite_fragment() throws RecognitionException {   
        // TestSuite.g:1085:13: ( inSoilExpression )
        // TestSuite.g:1085:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred4_TestSuite4403);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_TestSuite

    // $ANTLR start synpred5_TestSuite
    public final void synpred5_TestSuite_fragment() throws RecognitionException {   
        // TestSuite.g:1202:5: ( statStartingWithExpr )
        // TestSuite.g:1202:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred5_TestSuite4639);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_TestSuite

    // Delegated rules

    public final boolean synpred2_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA44_eotS =
        "\16\uffff";
    static final String DFA44_eofS =
        "\16\uffff";
    static final String DFA44_minS =
        "\1\4\7\uffff\1\10\5\uffff";
    static final String DFA44_maxS =
        "\1\131\7\uffff\1\37\5\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA44_specialS =
        "\16\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\7\2\uffff\1\5\24\uffff\1\3\1\4\1\6\56\uffff\1\1\1\2\4\10"+
            "\1\11\3\12\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\26\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "615:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
    static final String DFA54_eotS =
        "\51\uffff";
    static final String DFA54_eofS =
        "\51\uffff";
    static final String DFA54_minS =
        "\1\4\6\uffff\1\0\26\uffff\3\0\10\uffff";
    static final String DFA54_maxS =
        "\1\150\6\uffff\1\0\26\uffff\3\0\10\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\6\1\1\uffff\26\1\3\uffff\2\1\1\2\5\uffff";
    static final String DFA54_specialS =
        "\1\0\6\uffff\1\1\26\uffff\1\2\1\3\1\4\10\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\17\2\uffff\1\15\1\33\10\uffff\2\10\4\uffff\1\30\1\uffff\1"+
            "\1\2\uffff\1\13\1\14\1\16\16\uffff\1\41\2\uffff\1\3\1\2\1\uffff"+
            "\1\5\1\6\1\4\6\uffff\1\7\6\uffff\1\10\1\uffff\1\31\3\32\1\34"+
            "\3\uffff\1\11\1\12\4\20\1\21\1\23\1\24\1\25\1\26\1\27\1\22\3"+
            "\43\1\uffff\3\43\1\35\1\36\1\37\1\uffff\1\40\2\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "819:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | l= legacyStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==SEMI) && (synpred2_TestSuite())) {s = 1;}

                        else if ( (LA54_0==49) && (synpred2_TestSuite())) {s = 2;}

                        else if ( (LA54_0==48) && (synpred2_TestSuite())) {s = 3;}

                        else if ( (LA54_0==53) && (synpred2_TestSuite())) {s = 4;}

                        else if ( (LA54_0==51) && (synpred2_TestSuite())) {s = 5;}

                        else if ( (LA54_0==52) && (synpred2_TestSuite())) {s = 6;}

                        else if ( (LA54_0==60) ) {s = 7;}

                        else if ( ((LA54_0>=PLUS && LA54_0<=MINUS)||LA54_0==67) && (synpred2_TestSuite())) {s = 8;}

                        else if ( (LA54_0==77) && (synpred2_TestSuite())) {s = 9;}

                        else if ( (LA54_0==78) && (synpred2_TestSuite())) {s = 10;}

                        else if ( (LA54_0==INT) && (synpred2_TestSuite())) {s = 11;}

                        else if ( (LA54_0==REAL) && (synpred2_TestSuite())) {s = 12;}

                        else if ( (LA54_0==STRING) && (synpred2_TestSuite())) {s = 13;}

                        else if ( (LA54_0==HASH) && (synpred2_TestSuite())) {s = 14;}

                        else if ( (LA54_0==IDENT) && (synpred2_TestSuite())) {s = 15;}

                        else if ( ((LA54_0>=79 && LA54_0<=82)) && (synpred2_TestSuite())) {s = 16;}

                        else if ( (LA54_0==83) && (synpred2_TestSuite())) {s = 17;}

                        else if ( (LA54_0==89) && (synpred2_TestSuite())) {s = 18;}

                        else if ( (LA54_0==84) && (synpred2_TestSuite())) {s = 19;}

                        else if ( (LA54_0==85) && (synpred2_TestSuite())) {s = 20;}

                        else if ( (LA54_0==86) && (synpred2_TestSuite())) {s = 21;}

                        else if ( (LA54_0==87) && (synpred2_TestSuite())) {s = 22;}

                        else if ( (LA54_0==88) && (synpred2_TestSuite())) {s = 23;}

                        else if ( (LA54_0==AT) && (synpred2_TestSuite())) {s = 24;}

                        else if ( (LA54_0==69) && (synpred2_TestSuite())) {s = 25;}

                        else if ( ((LA54_0>=70 && LA54_0<=72)) && (synpred2_TestSuite())) {s = 26;}

                        else if ( (LA54_0==LPAREN) && (synpred2_TestSuite())) {s = 27;}

                        else if ( (LA54_0==73) && (synpred2_TestSuite())) {s = 28;}

                        else if ( (LA54_0==97) && (synpred2_TestSuite())) {s = 29;}

                        else if ( (LA54_0==98) ) {s = 30;}

                        else if ( (LA54_0==99) ) {s = 31;}

                        else if ( (LA54_0==101) ) {s = 32;}

                        else if ( (LA54_0==45) && (synpred2_TestSuite())) {s = 33;}

                        else if ( (LA54_0==104) && (synpred2_TestSuite())) {s = 34;}

                        else if ( ((LA54_0>=90 && LA54_0<=92)||(LA54_0>=94 && LA54_0<=96)) ) {s = 35;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_TestSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_30 = input.LA(1);

                         
                        int index54_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_TestSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index54_30);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_31 = input.LA(1);

                         
                        int index54_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_TestSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index54_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_32 = input.LA(1);

                         
                        int index54_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_TestSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index54_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\45\uffff";
    static final String DFA55_eofS =
        "\1\13\44\uffff";
    static final String DFA55_minS =
        "\1\4\4\uffff\1\0\1\uffff\1\0\1\uffff\2\0\32\uffff";
    static final String DFA55_maxS =
        "\1\150\4\uffff\1\0\1\uffff\1\0\1\uffff\2\0\32\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\31\uffff";
    static final String DFA55_specialS =
        "\1\0\4\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\32\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\13\2\uffff\2\13\10\uffff\2\13\4\uffff\1\13\1\uffff\1\13\2"+
            "\uffff\3\13\16\uffff\1\13\16\uffff\1\5\6\uffff\1\13\1\uffff"+
            "\5\13\3\uffff\15\13\1\10\1\3\1\4\1\uffff\1\1\1\2\1\6\1\13\1"+
            "\7\1\11\1\uffff\1\12\2\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "832:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==94) && (synpred3_TestSuite())) {s = 1;}

                        else if ( (LA55_0==95) && (synpred3_TestSuite())) {s = 2;}

                        else if ( (LA55_0==91) && (synpred3_TestSuite())) {s = 3;}

                        else if ( (LA55_0==92) && (synpred3_TestSuite())) {s = 4;}

                        else if ( (LA55_0==60) ) {s = 5;}

                        else if ( (LA55_0==96) && (synpred3_TestSuite())) {s = 6;}

                        else if ( (LA55_0==98) ) {s = 7;}

                        else if ( (LA55_0==90) && (synpred3_TestSuite())) {s = 8;}

                        else if ( (LA55_0==99) ) {s = 9;}

                        else if ( (LA55_0==101) ) {s = 10;}

                        else if ( (LA55_0==EOF||LA55_0==IDENT||(LA55_0>=STRING && LA55_0<=LPAREN)||(LA55_0>=PLUS && LA55_0<=MINUS)||LA55_0==AT||LA55_0==SEMI||(LA55_0>=INT && LA55_0<=HASH)||LA55_0==45||LA55_0==67||(LA55_0>=69 && LA55_0<=73)||(LA55_0>=77 && LA55_0<=89)||LA55_0==97||LA55_0==104) ) {s = 11;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_TestSuite()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_TestSuite()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_TestSuite()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_TestSuite()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\16\uffff";
    static final String DFA59_eofS =
        "\14\uffff\1\13\1\uffff";
    static final String DFA59_minS =
        "\1\74\1\4\7\uffff\1\6\1\4\1\uffff\1\31\1\uffff";
    static final String DFA59_maxS =
        "\1\145\1\4\7\uffff\1\12\1\4\1\uffff\1\145\1\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\1\1\uffff\1\3";
    static final String DFA59_specialS =
        "\16\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\3\35\uffff\1\6\1\1\1\2\3\uffff\1\4\1\uffff\1\5\1\7\1\uffff"+
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\3\uffff\1\12",
            "\1\14",
            "",
            "\1\13\26\uffff\2\13\1\uffff\3\13\6\uffff\1\13\35\uffff\3\13"+
            "\1\15\2\uffff\1\13\1\uffff\2\13\1\uffff\1\13",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "899:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat );";
        }
    }
    static final String DFA61_eotS =
        "\30\uffff";
    static final String DFA61_eofS =
        "\1\27\27\uffff";
    static final String DFA61_minS =
        "\1\4\27\uffff";
    static final String DFA61_maxS =
        "\1\131\27\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\26\1\1\2";
    static final String DFA61_specialS =
        "\1\0\27\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\11\2\uffff\1\7\1\25\10\uffff\2\2\4\uffff\1\22\4\uffff\1\5"+
            "\1\6\1\10\21\uffff\2\27\1\uffff\3\27\6\uffff\1\1\6\uffff\1\2"+
            "\1\uffff\1\23\3\24\1\26\3\uffff\1\3\1\4\4\12\1\13\1\15\1\16"+
            "\1\17\1\20\1\21\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "1085:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==60) && (synpred4_TestSuite())) {s = 1;}

                        else if ( ((LA61_0>=PLUS && LA61_0<=MINUS)||LA61_0==67) && (synpred4_TestSuite())) {s = 2;}

                        else if ( (LA61_0==77) && (synpred4_TestSuite())) {s = 3;}

                        else if ( (LA61_0==78) && (synpred4_TestSuite())) {s = 4;}

                        else if ( (LA61_0==INT) && (synpred4_TestSuite())) {s = 5;}

                        else if ( (LA61_0==REAL) && (synpred4_TestSuite())) {s = 6;}

                        else if ( (LA61_0==STRING) && (synpred4_TestSuite())) {s = 7;}

                        else if ( (LA61_0==HASH) && (synpred4_TestSuite())) {s = 8;}

                        else if ( (LA61_0==IDENT) && (synpred4_TestSuite())) {s = 9;}

                        else if ( ((LA61_0>=79 && LA61_0<=82)) && (synpred4_TestSuite())) {s = 10;}

                        else if ( (LA61_0==83) && (synpred4_TestSuite())) {s = 11;}

                        else if ( (LA61_0==89) && (synpred4_TestSuite())) {s = 12;}

                        else if ( (LA61_0==84) && (synpred4_TestSuite())) {s = 13;}

                        else if ( (LA61_0==85) && (synpred4_TestSuite())) {s = 14;}

                        else if ( (LA61_0==86) && (synpred4_TestSuite())) {s = 15;}

                        else if ( (LA61_0==87) && (synpred4_TestSuite())) {s = 16;}

                        else if ( (LA61_0==88) && (synpred4_TestSuite())) {s = 17;}

                        else if ( (LA61_0==AT) && (synpred4_TestSuite())) {s = 18;}

                        else if ( (LA61_0==69) && (synpred4_TestSuite())) {s = 19;}

                        else if ( ((LA61_0>=70 && LA61_0<=72)) && (synpred4_TestSuite())) {s = 20;}

                        else if ( (LA61_0==LPAREN) && (synpred4_TestSuite())) {s = 21;}

                        else if ( (LA61_0==73) && (synpred4_TestSuite())) {s = 22;}

                        else if ( (LA61_0==EOF||(LA61_0>=48 && LA61_0<=49)||(LA61_0>=51 && LA61_0<=53)) ) {s = 23;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\47\uffff";
    static final String DFA63_eofS =
        "\1\1\46\uffff";
    static final String DFA63_minS =
        "\1\4\20\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA63_maxS =
        "\1\150\20\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\7\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA63_specialS =
        "\1\0\20\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\21\2\uffff\1\17\1\35\10\uffff\2\12\4\uffff\1\32\1\uffff\1"+
            "\1\2\uffff\1\15\1\16\1\20\16\uffff\1\43\2\uffff\2\1\1\uffff"+
            "\3\1\6\uffff\1\11\6\uffff\1\12\1\uffff\1\33\3\34\1\36\1\uffff"+
            "\1\1\1\uffff\1\13\1\14\4\22\1\23\1\25\1\26\1\27\1\30\1\31\1"+
            "\24\7\uffff\1\37\1\40\1\41\1\uffff\1\42\2\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "1195:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==EOF||LA63_0==SEMI||(LA63_0>=48 && LA63_0<=49)||(LA63_0>=51 && LA63_0<=53)||LA63_0==75) ) {s = 1;}

                        else if ( (LA63_0==60) && (synpred5_TestSuite())) {s = 9;}

                        else if ( ((LA63_0>=PLUS && LA63_0<=MINUS)||LA63_0==67) && (synpred5_TestSuite())) {s = 10;}

                        else if ( (LA63_0==77) && (synpred5_TestSuite())) {s = 11;}

                        else if ( (LA63_0==78) && (synpred5_TestSuite())) {s = 12;}

                        else if ( (LA63_0==INT) && (synpred5_TestSuite())) {s = 13;}

                        else if ( (LA63_0==REAL) && (synpred5_TestSuite())) {s = 14;}

                        else if ( (LA63_0==STRING) && (synpred5_TestSuite())) {s = 15;}

                        else if ( (LA63_0==HASH) && (synpred5_TestSuite())) {s = 16;}

                        else if ( (LA63_0==IDENT) ) {s = 17;}

                        else if ( ((LA63_0>=79 && LA63_0<=82)) && (synpred5_TestSuite())) {s = 18;}

                        else if ( (LA63_0==83) && (synpred5_TestSuite())) {s = 19;}

                        else if ( (LA63_0==89) && (synpred5_TestSuite())) {s = 20;}

                        else if ( (LA63_0==84) && (synpred5_TestSuite())) {s = 21;}

                        else if ( (LA63_0==85) && (synpred5_TestSuite())) {s = 22;}

                        else if ( (LA63_0==86) && (synpred5_TestSuite())) {s = 23;}

                        else if ( (LA63_0==87) && (synpred5_TestSuite())) {s = 24;}

                        else if ( (LA63_0==88) && (synpred5_TestSuite())) {s = 25;}

                        else if ( (LA63_0==AT) && (synpred5_TestSuite())) {s = 26;}

                        else if ( (LA63_0==69) && (synpred5_TestSuite())) {s = 27;}

                        else if ( ((LA63_0>=70 && LA63_0<=72)) && (synpred5_TestSuite())) {s = 28;}

                        else if ( (LA63_0==LPAREN) && (synpred5_TestSuite())) {s = 29;}

                        else if ( (LA63_0==73) ) {s = 30;}

                        else if ( (LA63_0==97) ) {s = 31;}

                        else if ( (LA63_0==98) ) {s = 32;}

                        else if ( (LA63_0==99) ) {s = 33;}

                        else if ( (LA63_0==101) ) {s = 34;}

                        else if ( (LA63_0==45) ) {s = 35;}

                        else if ( (LA63_0==104) ) {s = 36;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_17 = input.LA(1);

                         
                        int index63_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_TestSuite()) ) {s = 29;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index63_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_30 = input.LA(1);

                         
                        int index63_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_TestSuite()) ) {s = 29;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index63_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_44_in_testSuite61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_testSuite71 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_testSuite82 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_testSuite84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_filename_in_testSuite93 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_testSuite105 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_testSuite112 = new BitSet(new long[]{0x1000200070860190L,0x0000012FDFFFE3E8L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testSuite118 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_testSuite124 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_testCases_in_testSuite145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testSuite154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_filename172 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_filename174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_filename178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testCase_in_testCases205 = new BitSet(new long[]{0x0004800000000002L});
    public static final BitSet FOLLOW_50_in_testCase224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_testCase228 = new BitSet(new long[]{0x003B000000000000L});
    public static final BitSet FOLLOW_48_in_testCase242 = new BitSet(new long[]{0x1000200070860190L,0x0000012FDFFFE3E8L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testCase248 = new BitSet(new long[]{0x003B000000000000L});
    public static final BitSet FOLLOW_assertStatement_in_testCase267 = new BitSet(new long[]{0x003B000000000000L});
    public static final BitSet FOLLOW_51_in_testCase285 = new BitSet(new long[]{0x003B000000000000L});
    public static final BitSet FOLLOW_52_in_testCase303 = new BitSet(new long[]{0x003B000000000000L});
    public static final BitSet FOLLOW_49_in_testCase315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_assertStatement336 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_assertStatement341 = new BitSet(new long[]{0x1F00000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_55_in_assertStatement347 = new BitSet(new long[]{0x1F00000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_assertStatement366 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_56_in_assertStatement382 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_56_in_assertStatement398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement402 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_57_in_assertStatement418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertStatement424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement428 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_assertionStatementPre_in_assertStatement448 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_assertionStatementPost_in_assertStatement469 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_assertStatement486 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_assertStatement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_assertionStatementPre513 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre521 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_assertionStatementPre527 = new BitSet(new long[]{0x1000000070860390L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre538 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_assertionStatementPre544 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre548 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RPAREN_in_assertionStatementPre561 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertionStatementPre564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_assertionStatementPost593 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPost602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_expression695 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_expression699 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_expression703 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_expression708 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_expression712 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_expression714 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList772 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList789 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_paramList801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList805 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RPAREN_in_paramList825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList854 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_idList864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_idList868 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration899 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration901 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression941 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_conditionalImpliesExpression954 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression958 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1003 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_conditionalOrExpression1016 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1020 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_conditionalXOrExpression1077 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalAndExpression1138 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1190 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_equalityExpression1209 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1219 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1268 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1286 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1304 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1354 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1372 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1382 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1432 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1450 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1464 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_unaryExpression1526 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1603 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1621 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001E0L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1627 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001E0L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1638 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1715 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1719 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1745 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_primaryExpression1749 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1753 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1755 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1776 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primaryExpression1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1952 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1959 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1970 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1974 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_queryExpression1985 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_iterateExpression2023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2037 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2047 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2049 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2057 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2107 = new BitSet(new long[]{0x0000000004800102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2129 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2142 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2155 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2159 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2171 = new BitSet(new long[]{0x0000000004800102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2188 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2203 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2218 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2222 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2236 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_AT_in_operationExpression2261 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_operationExpression2263 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2283 = new BitSet(new long[]{0x1000000070860390L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2304 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2316 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_operationExpression2320 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2389 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2405 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_typeExpression2409 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2449 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2452 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2456 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2472 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2475 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2481 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2509 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2511 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2515 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2517 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ifExpression2553 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_ifExpression2557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifExpression2559 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_ifExpression2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ifExpression2565 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_ifExpression2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ifExpression2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_literal2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_literal2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2796 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2825 = new BitSet(new long[]{0x1000000170860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2842 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2855 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2859 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2907 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2918 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_collectionItem2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_emptyCollectionLiteral2951 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2953 = new BitSet(new long[]{0x0000000000000000L,0x00000000020F8000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2957 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2975 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2977 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_undefinedLiteral3009 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3011 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3015 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_undefinedLiteral3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3045 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3047 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3051 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_tupleLiteral3106 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3120 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3135 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3177 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3216 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_tupleItem3220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3222 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_tupleItem3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3248 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_tupleItem3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_dateLiteral3303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral3305 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral3309 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3485 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3512 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_collectionType3516 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_tupleType3552 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3563 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3578 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3622 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3624 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_tuplePart3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommandOnly3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand3713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand3731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3796 = new BitSet(new long[]{0x1000200070860192L,0x0000012FDFFFE3E8L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3807 = new BitSet(new long[]{0x1000200070860192L,0x0000012FDFFFE3E8L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat3841 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_singleLegacyStat3982 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat3986 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_legacyCreate4062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate4070 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate4074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_legacyCreateAssign4119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign4127 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_legacyCreateAssign4135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_legacyCreateInsert4177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert4185 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert4189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert4197 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_legacyCreateInsert4201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert4205 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4215 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_legacyLet4252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet4260 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_legacyLet4270 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_legacyLet4280 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet4289 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_legacyOpEnter4330 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter4338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter4346 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter4350 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter4360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_legacyOpExit4399 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_legacyExecute4448 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_expression_in_legacyExecute4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat4533 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_SEMI_in_stat4544 = new BitSet(new long[]{0x1000200070860190L,0x0000012E03FFE3E8L});
    public static final BitSet FOLLOW_nextStat_in_stat4550 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4826 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4878 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4882 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4930 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4934 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_objCreateStat4968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4976 = new BitSet(new long[]{0x0000000000000102L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4986 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4998 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5004 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_objCreateStat5022 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5030 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5044 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_objDestroyStat5088 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_lnkInsStat5122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat5126 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5136 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat5140 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_lnkInsStat5144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5181 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5192 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5201 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5224 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5235 = new BitSet(new long[]{0x0000000080000042L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5246 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5255 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5262 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5284 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5299 = new BitSet(new long[]{0x0000000080000042L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5319 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5330 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5339 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_101_in_lnkDelStat5380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5384 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5394 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5398 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_lnkDelStat5402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_condExStat5442 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat5451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_condExStat5455 = new BitSet(new long[]{0x1000200070860190L,0x0000012E03FFE3E8L});
    public static final BitSet FOLLOW_stat_in_condExStat5464 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_condExStat5475 = new BitSet(new long[]{0x1000200070860190L,0x0000012E03FFE3E8L});
    public static final BitSet FOLLOW_stat_in_condExStat5487 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_condExStat5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_iterStat5523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_iterStat5531 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_iterStat5535 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat5543 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_iterStat5547 = new BitSet(new long[]{0x1000200070860190L,0x0000012E03FFE3E8L});
    public static final BitSet FOLLOW_stat_in_iterStat5555 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iterStat5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_whileStat5585 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5593 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_whileStat5597 = new BitSet(new long[]{0x1000200070860190L,0x0000012E03FFE3E8L});
    public static final BitSet FOLLOW_stat_in_whileStat5605 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_whileStat5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15757 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15771 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15781 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25828 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25836 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25850 = new BitSet(new long[]{0x1000000070860190L,0x0000000203FFE3E8L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25860 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15974 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin15989 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15999 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26047 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26055 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26069 = new BitSet(new long[]{0x1000000070860190L,0x0000000003FFE3E8L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26079 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_nothing_in_identList6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16160 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_identListMin16174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16184 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COLON_in_synpred1_TestSuite3207 = new BitSet(new long[]{0x0000000000000010L,0x00000000028F8000L});
    public static final BitSet FOLLOW_type_in_synpred1_TestSuite3209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_TestSuite3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred2_TestSuite3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_TestSuite3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred4_TestSuite4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred5_TestSuite4639 = new BitSet(new long[]{0x0000000000000002L});

}