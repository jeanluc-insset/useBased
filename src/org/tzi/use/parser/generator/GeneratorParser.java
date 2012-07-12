// $ANTLR 3.3 Nov 30, 2010 12:45:30 Generator.g 2011-10-20 16:14:28
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
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

package org.tzi.use.parser.generator;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class GeneratorParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LPAREN", "RPAREN", "SEMI", "COMMA", "COLON_EQUAL", "DOT", "LBRACK", "RBRACK", "COLON_COLON", "LBRACE", "RBRACE", "LESS", "COLON", "EQUAL", "DOTDOT", "INT", "STAR", "AT", "NON_OCL_STRING", "NOT_EQUAL", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "SLASH", "ARROW", "BAR", "REAL", "STRING", "HASH", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "RANGE_OR_INT", "ESC", "HEX_DIGIT", "VOCAB", "'procedure'", "'var'", "'begin'", "'end'", "'for'", "'in'", "'if'", "'then'", "'else'", "'ASSLCall'", "'OpEnter'", "'OpExit'", "'Barrier'", "'model'", "'constraints'", "'enum'", "'abstract'", "'attributes'", "'operations'", "'associationClass'", "'associationclass'", "'between'", "'ordered'", "'subsets'", "'redefines'", "'context'", "'inv'", "'existential'", "'pre'", "'post'", "'let'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'", "'new'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'do'", "'while'"
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
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int IDENT=4;
    public static final int LPAREN=5;
    public static final int RPAREN=6;
    public static final int SEMI=7;
    public static final int COMMA=8;
    public static final int COLON_EQUAL=9;
    public static final int DOT=10;
    public static final int LBRACK=11;
    public static final int RBRACK=12;
    public static final int COLON_COLON=13;
    public static final int LBRACE=14;
    public static final int RBRACE=15;
    public static final int LESS=16;
    public static final int COLON=17;
    public static final int EQUAL=18;
    public static final int DOTDOT=19;
    public static final int INT=20;
    public static final int STAR=21;
    public static final int AT=22;
    public static final int NON_OCL_STRING=23;
    public static final int NOT_EQUAL=24;
    public static final int GREATER=25;
    public static final int LESS_EQUAL=26;
    public static final int GREATER_EQUAL=27;
    public static final int PLUS=28;
    public static final int MINUS=29;
    public static final int SLASH=30;
    public static final int ARROW=31;
    public static final int BAR=32;
    public static final int REAL=33;
    public static final int STRING=34;
    public static final int HASH=35;
    public static final int NEWLINE=36;
    public static final int WS=37;
    public static final int SL_COMMENT=38;
    public static final int ML_COMMENT=39;
    public static final int RANGE_OR_INT=40;
    public static final int ESC=41;
    public static final int HEX_DIGIT=42;
    public static final int VOCAB=43;

    // delegates
    // delegators


        public GeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "Generator.g"; }



    // $ANTLR start "invariantListOnly"
    // Generator.g:78:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;

        ASTConstraintDefinition def = null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:80:1: ( (def= invariant )* EOF )
            // Generator.g:81:5: (def= invariant )* EOF
            {
            // Generator.g:81:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==69) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:81:7: def= invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_invariantListOnly80);
            	    def=invariant();

            	    state._fsp--;
            	    if (state.failed) return invariantList;
            	    if ( state.backtracking==0 ) {
            	       invariantList.add(def); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_invariantListOnly91); if (state.failed) return invariantList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return invariantList;
    }
    // $ANTLR end "invariantListOnly"


    // $ANTLR start "procedureListOnly"
    // Generator.g:135:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;

        ASTGProcedure proc = null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:137:1: ( (proc= procedure )* EOF )
            // Generator.g:138:5: (proc= procedure )* EOF
            {
            // Generator.g:138:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:139:7: proc= procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureListOnly136);
            	    proc=procedure();

            	    state._fsp--;
            	    if (state.failed) return procedureList;
            	    if ( state.backtracking==0 ) {
            	       procedureList.add(proc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_procedureListOnly151); if (state.failed) return procedureList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return procedureList;
    }
    // $ANTLR end "procedureListOnly"


    // $ANTLR start "procedure"
    // Generator.g:150:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;

        Token name=null;
        List parameterDecls = null;

        List localDecls = null;

        List instructions = null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:152:1: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:153:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,44,FOLLOW_44_in_procedure179); if (state.failed) return proc;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;
            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;
            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;
            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;
            // Generator.g:154:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:154:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,45,FOLLOW_45_in_procedure199); if (state.failed) return proc;
                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;
                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_procedure214); if (state.failed) return proc;
            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;
            match(input,47,FOLLOW_47_in_procedure220); if (state.failed) return proc;
            match(input,SEMI,FOLLOW_SEMI_in_procedure222); if (state.failed) return proc;
            if ( state.backtracking==0 ) {
               proc = new ASTGProcedure(name, parameterDecls, localDecls, instructions ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return proc;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "variableDeclarationList"
    // Generator.g:163:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;

        ASTVariableDeclaration decl = null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:165:1: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:166:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:166:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:166:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;
                    if ( state.backtracking==0 ) {
                      varDecls.add(decl);
                    }
                    // Generator.g:167:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:167:8: COMMA decl= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList271); if (state.failed) return varDecls;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList275);
                    	    decl=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return varDecls;
                    	    if ( state.backtracking==0 ) {
                    	      varDecls.add(decl);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
        return varDecls;
    }
    // $ANTLR end "variableDeclarationList"


    // $ANTLR start "instructionList"
    // Generator.g:175:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;

        ASTGInstruction instr = null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:177:1: ( (instr= instruction SEMI )* )
            // Generator.g:178:5: (instr= instruction SEMI )*
            {
            // Generator.g:178:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==48||LA6_0==50||(LA6_0>=53 && LA6_0<=56)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:178:7: instr= instruction SEMI
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructionList319);
            	    instr=instruction();

            	    state._fsp--;
            	    if (state.failed) return instructions;
            	    match(input,SEMI,FOLLOW_SEMI_in_instructionList321); if (state.failed) return instructions;
            	    if ( state.backtracking==0 ) {
            	      instructions.add(instr);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
        return instructions;
    }
    // $ANTLR end "instructionList"


    // $ANTLR start "instruction"
    // Generator.g:193:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit | instrBA= barrier );
    public final ASTGInstruction instruction() throws RecognitionException {
        ASTGInstruction instr = null;

        ASTGVariableAssignment instrVA = null;

        ASTGAttributeAssignment instrAA = null;

        ASTGLoop instrLO = null;

        ASTGAtomicInstruction instrAI = null;

        ASTGIfThenElse instrIT = null;

        ASTGAsslCall instrAC = null;

        ASTGOpEnter instrOE = null;

        ASTGOpExit instrOX = null;

        ASTGBarrier instrBA = null;


        try {
            // Generator.g:194:1: (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit | instrBA= barrier )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Generator.g:195:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrVA;
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:196:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAA;
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:197:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrLO;
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:198:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAI;
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:199:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrIT;
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:200:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAC;
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:201:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrOE;
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:202:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrOX;
                    }

                    }
                    break;
                case 9 :
                    // Generator.g:203:7: instrBA= barrier
                    {
                    pushFollow(FOLLOW_barrier_in_instruction482);
                    instrBA=barrier();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrBA;
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
        return instr;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "variableAssignment"
    // Generator.g:210:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;

        Token target=null;
        ASTGValueInstruction source = null;


        try {
            // Generator.g:211:1: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:212:5: target= IDENT COLON_EQUAL source= valueInstruction
            {
            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableAssignment513); if (state.failed) return assignment;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_variableAssignment515); if (state.failed) return assignment;
            pushFollow(FOLLOW_valueInstruction_in_variableAssignment519);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;
            if ( state.backtracking==0 ) {
               assignment = new ASTGVariableAssignment( target, source ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assignment;
    }
    // $ANTLR end "variableAssignment"


    // $ANTLR start "attributeAssignment"
    // Generator.g:220:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;

        Token attributeName=null;
        ASTGocl targetObject = null;

        ASTGValueInstruction source = null;


        try {
            // Generator.g:221:1: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:222:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
            {
            pushFollow(FOLLOW_oclExpression_in_attributeAssignment551);
            targetObject=oclExpression();

            state._fsp--;
            if (state.failed) return assignment;
            match(input,DOT,FOLLOW_DOT_in_attributeAssignment553); if (state.failed) return assignment;
            attributeName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeAssignment557); if (state.failed) return assignment;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attributeAssignment565); if (state.failed) return assignment;
            pushFollow(FOLLOW_valueInstruction_in_attributeAssignment569);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;
            if ( state.backtracking==0 ) {
               assignment = new ASTGAttributeAssignment(
              			 targetObject, attributeName, source ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assignment;
    }
    // $ANTLR end "attributeAssignment"


    // $ANTLR start "loop"
    // Generator.g:232:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;

        Token t=null;
        ASTVariableDeclaration decl = null;

        ASTGocl sequence = null;

        List instructions = null;


        try {
            // Generator.g:233:1: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:234:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,48,FOLLOW_48_in_loop601); if (state.failed) return loop;
            pushFollow(FOLLOW_variableDeclaration_in_loop605);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;
            match(input,49,FOLLOW_49_in_loop607); if (state.failed) return loop;
            pushFollow(FOLLOW_oclExpression_in_loop611);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;
            match(input,46,FOLLOW_46_in_loop613); if (state.failed) return loop;
            pushFollow(FOLLOW_instructionList_in_loop624);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;
            match(input,47,FOLLOW_47_in_loop626); if (state.failed) return loop;
            if ( state.backtracking==0 ) {
               loop = new ASTGLoop( decl, sequence, instructions, t ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return loop;
    }
    // $ANTLR end "loop"


    // $ANTLR start "ifThenElse"
    // Generator.g:245:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;

        Token token=null;
        ASTGocl sequence = null;

        List thenInstructions = null;

        List elseInstructions = null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:247:1: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:248:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,50,FOLLOW_50_in_ifThenElse662); if (state.failed) return ifThenElse;
            pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;
            match(input,51,FOLLOW_51_in_ifThenElse677); if (state.failed) return ifThenElse;
            match(input,46,FOLLOW_46_in_ifThenElse679); if (state.failed) return ifThenElse;
            pushFollow(FOLLOW_instructionList_in_ifThenElse683);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;
            match(input,47,FOLLOW_47_in_ifThenElse685); if (state.failed) return ifThenElse;
            // Generator.g:250:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:250:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,52,FOLLOW_52_in_ifThenElse696); if (state.failed) return ifThenElse;
                    match(input,46,FOLLOW_46_in_ifThenElse698); if (state.failed) return ifThenElse;
                    pushFollow(FOLLOW_instructionList_in_ifThenElse702);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;
                    match(input,47,FOLLOW_47_in_ifThenElse704); if (state.failed) return ifThenElse;
                    if ( state.backtracking==0 ) {
                       elseInstructionsList=elseInstructions; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               ifThenElse = new ASTGIfThenElse( sequence, thenInstructions,
                              elseInstructionsList, token ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ifThenElse;
    }
    // $ANTLR end "ifThenElse"


    // $ANTLR start "valueInstruction"
    // Generator.g:259:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction | oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;

        ASTGAtomicInstruction atmoicInstr = null;

        ASTGocl oclExpr = null;


        try {
            // Generator.g:260:1: (atmoicInstr= atomicInstruction | oclExpr= oclExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==LBRACK) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return valueinstr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Generator.g:261:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;
                    if ( state.backtracking==0 ) {
                      valueinstr = atmoicInstr; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:262:7: oclExpr= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_valueInstruction758);
                    oclExpr=oclExpression();

                    state._fsp--;
                    if (state.failed) return valueinstr;
                    if ( state.backtracking==0 ) {
                      valueinstr = oclExpr; 
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
        return valueinstr;
    }
    // $ANTLR end "valueInstruction"


    // $ANTLR start "atomicInstruction"
    // Generator.g:270:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;

        Token name=null;
        Object parameter = null;


        try {
            // Generator.g:271:1: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:272:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGAtomicInstruction(name); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;
            // Generator.g:273:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:273:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:274:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:274:15: COMMA parameter= instructionParameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_atomicInstruction824); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction828);
                    	    parameter=instructionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_atomicInstruction876); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "atomicInstruction"


    // $ANTLR start "asslCall"
    // Generator.g:285:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;

        Token name=null;
        ASTGocl parameter = null;


        try {
            // Generator.g:286:1: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:287:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,53,FOLLOW_53_in_asslCall899); if (state.failed) return instr;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGAsslCall(name); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;
            // Generator.g:288:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:288:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall921);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:289:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:289:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_asslCall939); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_oclExpression_in_asslCall943);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_asslCall991); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "asslCall"


    // $ANTLR start "opEnter"
    // Generator.g:300:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;

        Token opname=null;
        ASTGocl oid = null;

        ASTGocl parameter = null;


        try {
            // Generator.g:301:1: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:302:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,54,FOLLOW_54_in_opEnter1014); if (state.failed) return instr;
            pushFollow(FOLLOW_oclExpression_in_opEnter1018);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;
            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGOpEnter(oid, opname); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;
            // Generator.g:303:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:303:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1041);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:304:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:304:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_opEnter1059); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_oclExpression_in_opEnter1063);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
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

            match(input,RPAREN,FOLLOW_RPAREN_in_opEnter1111); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "opEnter"


    // $ANTLR start "opExit"
    // Generator.g:314:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;

        try {
            // Generator.g:315:1: ( 'OpExit' )
            // Generator.g:316:5: 'OpExit'
            {
            match(input,55,FOLLOW_55_in_opExit1134); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGOpExit(); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "opExit"


    // $ANTLR start "instructionParameter"
    // Generator.g:322:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression | parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;

        ASTGocl parameterOcl = null;

        Token parameterIdent = null;


        try {
            // Generator.g:323:1: (parameterOcl= oclExpression | parameterIdent= instrParameterIdent )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACK) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Generator.g:324:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;
                    if ( state.backtracking==0 ) {
                      parameter = parameterOcl; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:325:7: parameterIdent= instrParameterIdent
                    {
                    pushFollow(FOLLOW_instrParameterIdent_in_instructionParameter1175);
                    parameterIdent=instrParameterIdent();

                    state._fsp--;
                    if (state.failed) return parameter;
                    if ( state.backtracking==0 ) {
                      parameter = parameterIdent; 
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
        return parameter;
    }
    // $ANTLR end "instructionParameter"


    // $ANTLR start "instrParameterIdent"
    // Generator.g:332:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;

        Token i=null;

        try {
            // Generator.g:333:1: (i= IDENT )
            // Generator.g:334:5: i= IDENT
            {
            i=(Token)match(input,IDENT,FOLLOW_IDENT_in_instrParameterIdent1203); if (state.failed) return t;
            if ( state.backtracking==0 ) {
               t = i; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "instrParameterIdent"


    // $ANTLR start "oclExpression"
    // Generator.g:341:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;

        Token i=null;
        GeneratorParser.expression_return ocl = null;


        try {
            // Generator.g:342:1: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:343:5: i= LBRACK ocl= expression RBRACK
            {
            i=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_oclExpression1231); if (state.failed) return encapOcl;
            pushFollow(FOLLOW_expression_in_oclExpression1235);
            ocl=expression();

            state._fsp--;
            if (state.failed) return encapOcl;
            match(input,RBRACK,FOLLOW_RBRACK_in_oclExpression1237); if (state.failed) return encapOcl;
            if ( state.backtracking==0 ) {
               encapOcl = new ASTGocl((ocl!=null?ocl.n:null), i); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return encapOcl;
    }
    // $ANTLR end "oclExpression"


    // $ANTLR start "barrier"
    // Generator.g:350:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT | exp= oclExpression ) RPAREN ;
    public final ASTGBarrier barrier() throws RecognitionException {
        ASTGBarrier barrier = null;

        Token invClass=null;
        Token invName=null;
        ASTGocl exp = null;


        try {
            // Generator.g:351:1: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT | exp= oclExpression ) RPAREN )
            // Generator.g:352:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT | exp= oclExpression ) RPAREN
            {
            match(input,56,FOLLOW_56_in_barrier1265); if (state.failed) return barrier;
            match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;
            // Generator.g:353:11: (invClass= IDENT COLON_COLON invName= IDENT | exp= oclExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            else if ( (LA17_0==LBRACK) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return barrier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Generator.g:354:8: invClass= IDENT COLON_COLON invName= IDENT
                    {
                    invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;
                    invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;
                    if ( state.backtracking==0 ) {
                       barrier = new ASTGBarrierInvariant(invClass, invName); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:355:8: exp= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_barrier1309);
                    exp=oclExpression();

                    state._fsp--;
                    if (state.failed) return barrier;
                    if ( state.backtracking==0 ) {
                       barrier = new ASTGBarrierExpression(exp); 
                    }

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_barrier1321); if (state.failed) return barrier;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return barrier;
    }
    // $ANTLR end "barrier"


    // $ANTLR start "procedureCallOnly"
    // Generator.g:368:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;

        Token name=null;
        GeneratorParser.expression_return ocl = null;


        try {
            // Generator.g:369:1: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:370:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;
            if ( state.backtracking==0 ) {
              call = new ASTGProcedureCall(name);
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;
            // Generator.g:371:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=IDENT && LA19_0<=LPAREN)||LA19_0==INT||LA19_0==AT||(LA19_0>=PLUS && LA19_0<=MINUS)||(LA19_0>=REAL && LA19_0<=HASH)||LA19_0==50||LA19_0==74||LA19_0==80||(LA19_0>=82 && LA19_0<=85)||(LA19_0>=87 && LA19_0<=99)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Generator.g:372:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;
                    if ( state.backtracking==0 ) {
                      call.addParameter((ocl!=null?ocl.n:null));
                    }
                    // Generator.g:373:5: ( COMMA ocl= expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Generator.g:373:7: COMMA ocl= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_procedureCallOnly1374); if (state.failed) return call;
                    	    pushFollow(FOLLOW_expression_in_procedureCallOnly1378);
                    	    ocl=expression();

                    	    state._fsp--;
                    	    if (state.failed) return call;
                    	    if ( state.backtracking==0 ) {
                    	      call.addParameter((ocl!=null?ocl.n:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_procedureCallOnly1392); if (state.failed) return call;
            match(input,EOF,FOLLOW_EOF_in_procedureCallOnly1398); if (state.failed) return call;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return call;
    }
    // $ANTLR end "procedureCallOnly"


    // $ANTLR start "model"
    // Generator.g:392:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;

        Token modelName=null;
        Set<ASTAnnotation> as = null;

        ASTEnumTypeDefinition e = null;

        ASTAssociation a = null;

        ASTConstraintDefinition cons = null;

        ASTPrePost ppc = null;


        try {
            // Generator.g:393:1: (as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF )
            // Generator.g:394:2: as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1426);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,57,FOLLOW_57_in_model1432); if (state.failed) return n;
            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1436); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTModel(modelName); n.setAnnotations(as); 
            }
            // Generator.g:396:5: (e= enumTypeDefinition )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // Generator.g:396:7: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model1448);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnumTypeDef(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // Generator.g:397:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*
            loop22:
            do {
                int alt22=4;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // Generator.g:397:9: ( generalClassDefinition[$n] )
            	    {
            	    // Generator.g:397:9: ( generalClassDefinition[$n] )
            	    // Generator.g:397:11: generalClassDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassDefinition_in_model1465);
            	    generalClassDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Generator.g:398:9: (a= associationDefinition )
            	    {
            	    // Generator.g:398:9: (a= associationDefinition )
            	    // Generator.g:398:11: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model1482);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addAssociation(a); 
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Generator.g:399:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    {
            	    // Generator.g:399:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    // Generator.g:399:11: 'constraints' (cons= invariant | ppc= prePost )*
            	    {
            	    match(input,58,FOLLOW_58_in_model1498); if (state.failed) return n;
            	    // Generator.g:400:11: (cons= invariant | ppc= prePost )*
            	    loop21:
            	    do {
            	        int alt21=3;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==69) ) {
            	            int LA21_2 = input.LA(2);

            	            if ( (LA21_2==IDENT) ) {
            	                int LA21_3 = input.LA(3);

            	                if ( (LA21_3==COLON_COLON) ) {
            	                    alt21=2;
            	                }
            	                else if ( (LA21_3==EOF||LA21_3==IDENT||LA21_3==COMMA||LA21_3==COLON||LA21_3==AT||LA21_3==58||LA21_3==60||(LA21_3>=63 && LA21_3<=64)||(LA21_3>=69 && LA21_3<=71)) ) {
            	                    alt21=1;
            	                }


            	            }


            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // Generator.g:400:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model1516);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addConstraint(cons); 
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // Generator.g:401:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model1537);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addPrePost(ppc); 
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_model1578); if (state.failed) return n;

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
    // $ANTLR end "model"


    // $ANTLR start "enumTypeDefinition"
    // Generator.g:412:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List idListRes = null;


        try {
            // Generator.g:413:1: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // Generator.g:414:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1606);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,59,FOLLOW_59_in_enumTypeDefinition1612); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1616); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1618); if (state.failed) return n;
            pushFollow(FOLLOW_idList_in_enumTypeDefinition1622);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1624); if (state.failed) return n;
            // Generator.g:415:54: ( SEMI )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SEMI) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:415:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1628); if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); 
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
    // $ANTLR end "enumTypeDefinition"


    // $ANTLR start "generalClassDefinition"
    // Generator.g:424:1: generalClassDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) ;
    public final void generalClassDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as = null;

        ASTClass c = null;

        ASTAssociationClass ac = null;


         
          boolean isAbstract = false;

        try {
            // Generator.g:428:1: (as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) )
            // Generator.g:429:2: as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassDefinition1666);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;
            // Generator.g:430:5: ( 'abstract' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Generator.g:430:7: 'abstract'
                    {
                    match(input,60,FOLLOW_60_in_generalClassDefinition1674); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       isAbstract = true; 
                    }

                    }
                    break;

            }

            // Generator.g:431:5: ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=63 && LA25_0<=64)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // Generator.g:431:7: (c= classDefinition[isAbstract] )
                    {
                    // Generator.g:431:7: (c= classDefinition[isAbstract] )
                    // Generator.g:431:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassDefinition1692);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       n.addClass(c); c.setAnnotations(as); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:432:7: (ac= associationClassDefinition[isAbstract] )
                    {
                    // Generator.g:432:7: (ac= associationClassDefinition[isAbstract] )
                    // Generator.g:432:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassDefinition1712);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       n.addAssociationClass(ac); ac.setAnnotations(as); 
                    }

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
        return ;
    }
    // $ANTLR end "generalClassDefinition"


    // $ANTLR start "classDefinition"
    // Generator.g:449:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;

        Token name=null;
        List idListRes = null;

        ASTAttribute a = null;

        ASTOperation op = null;

        ASTInvariantClause inv = null;


         List idList; 
        try {
            // Generator.g:451:1: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:452:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition1751);
            keyClass();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1755); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTClass(name, isAbstract); 
            }
            // Generator.g:453:5: ( LESS idListRes= idList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LESS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Generator.g:453:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1765); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_classDefinition1769);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // Generator.g:454:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==61) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Generator.g:454:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,61,FOLLOW_61_in_classDefinition1782); if (state.failed) return n;
                    // Generator.g:455:7: (a= attributeDefinition )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT||LA27_0==AT||LA27_0==57||(LA27_0>=59 && LA27_0<=60)||(LA27_0>=63 && LA27_0<=64)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Generator.g:455:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1795);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:457:5: ( 'operations' (op= operationDefinition )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==62) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Generator.g:457:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,62,FOLLOW_62_in_classDefinition1816); if (state.failed) return n;
                    // Generator.g:458:7: (op= operationDefinition )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==IDENT||LA29_0==AT||LA29_0==57||(LA29_0>=59 && LA29_0<=60)||(LA29_0>=63 && LA29_0<=64)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Generator.g:458:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1829);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:460:5: ( 'constraints' (inv= invariantClause )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Generator.g:460:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,58,FOLLOW_58_in_classDefinition1850); if (state.failed) return n;
                    // Generator.g:461:7: (inv= invariantClause )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=70 && LA31_0<=71)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Generator.g:462:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1870);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_classDefinition1894); if (state.failed) return n;

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
    // $ANTLR end "classDefinition"


    // $ANTLR start "associationClassDefinition"
    // Generator.g:483:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
    public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
        ASTAssociationClass n = null;

        Token classKW=null;
        Token name=null;
        List idListRes = null;

        ASTAssociationEnd ae = null;

        ASTAttribute a = null;

        ASTOperation op = null;

        ASTInvariantClause inv = null;


        List idList; Token t = null;
        try {
            // Generator.g:485:1: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // Generator.g:486:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               
                  	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
                             reportWarning("the 'associationClass' keyword is deprecated and will " +
                                           "not be supported in the future, use 'associationclass' instead");
                          }  
                  
            }
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition1953); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationClass(name, isAbstract); 
            }
            // Generator.g:495:5: ( LESS idListRes= idList )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LESS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Generator.g:495:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition1963); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_associationClassDefinition1967);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // Generator.g:496:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==65) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Generator.g:496:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,65,FOLLOW_65_in_associationClassDefinition1979); if (state.failed) return n;
                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1987);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addEnd(ae); 
                    }
                    // Generator.g:498:5: (ae= associationEnd )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==IDENT) ) {
                            int LA34_2 = input.LA(2);

                            if ( (LA34_2==LBRACK) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0==AT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Generator.g:498:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1999);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addEnd(ae); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }

            // Generator.g:500:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Generator.g:500:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,61,FOLLOW_61_in_associationClassDefinition2019); if (state.failed) return n;
                    // Generator.g:501:7: (a= attributeDefinition )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==IDENT) ) {
                            int LA36_2 = input.LA(2);

                            if ( (LA36_2==COLON) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0==AT) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Generator.g:501:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2032);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:503:5: ( 'operations' (op= operationDefinition )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Generator.g:503:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,62,FOLLOW_62_in_associationClassDefinition2053); if (state.failed) return n;
                    // Generator.g:504:7: (op= operationDefinition )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==IDENT) ) {
                            int LA38_2 = input.LA(2);

                            if ( (LA38_2==LPAREN) ) {
                                alt38=1;
                            }


                        }
                        else if ( (LA38_0==AT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Generator.g:504:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2066);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
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

            // Generator.g:506:5: ( 'constraints' (inv= invariantClause )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Generator.g:506:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,58,FOLLOW_58_in_associationClassDefinition2087); if (state.failed) return n;
                    // Generator.g:507:7: (inv= invariantClause )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=70 && LA40_0<=71)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Generator.g:508:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2107);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:511:5: ( ( keyAggregation | keyComposition ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Generator.g:511:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) {
                       t = input.LT(1); 
                    }
                    // Generator.g:512:7: ( keyAggregation | keyComposition )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==IDENT) ) {
                        int LA42_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt42=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt42=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // Generator.g:512:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2143);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:512:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2147);
                            keyComposition();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n.setKind(t); 
                    }

                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_associationClassDefinition2170); if (state.failed) return n;

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
    // $ANTLR end "associationClassDefinition"


    // $ANTLR start "attributeDefinition"
    // Generator.g:522:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTType t = null;


        try {
            // Generator.g:523:1: (as= annotationSet name= IDENT COLON t= type ( SEMI )? )
            // Generator.g:524:2: as= annotationSet name= IDENT COLON t= type ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2198);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2206); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2208); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_attributeDefinition2212);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:525:29: ( SEMI )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SEMI) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Generator.g:525:31: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2216); if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTAttribute(name, t); n.setAnnotations(as); 
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
    // $ANTLR end "attributeDefinition"


    // $ANTLR start "operationDefinition"
    // Generator.g:534:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List<ASTVariableDeclaration> pl = null;

        ASTType t = null;

        GeneratorParser.expression_return e = null;

        GeneratorParser.stat_return s = null;

        ASTPrePostClause ppc = null;


        try {
            // Generator.g:535:1: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? )
            // Generator.g:536:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2253);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2263); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_operationDefinition2273);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:542:5: ( COLON t= type )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==COLON) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Generator.g:542:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2287); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_operationDefinition2293);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTOperation(name, pl, t); n.setAnnotations(as); 
            }
            // Generator.g:544:5: ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==EQUAL) ) {
                alt46=1;
            }
            else if ( (LA46_0==46) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // Generator.g:545:9: ( EQUAL e= expression )
                    {
                    // Generator.g:545:9: ( EQUAL e= expression )
                    // Generator.g:545:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2321); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_operationDefinition2327);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setExpression((e!=null?e.n:null)); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:546:9: ( 'begin' s= stat 'end' )
                    {
                    // Generator.g:546:9: ( 'begin' s= stat 'end' )
                    // Generator.g:546:11: 'begin' s= stat 'end'
                    {
                    match(input,46,FOLLOW_46_in_operationDefinition2345); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_operationDefinition2351);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,47,FOLLOW_47_in_operationDefinition2353); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setStatement((s!=null?s.n:null));  
                    }

                    }


                    }
                    break;

            }

            // Generator.g:548:5: (ppc= prePostClause )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=72 && LA47_0<=73)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Generator.g:548:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2374);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // Generator.g:549:5: ( SEMI )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==SEMI) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Generator.g:549:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2387); if (state.failed) return n;

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
    // $ANTLR end "operationDefinition"


    // $ANTLR start "associationDefinition"
    // Generator.g:559:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTAssociationEnd ae = null;


         Token t = null; 
        try {
            // Generator.g:561:1: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // Generator.g:562:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2418);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            // Generator.g:564:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt49=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt49=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // Generator.g:564:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2432);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:564:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2436);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:564:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2440);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2450); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociation(t, name); n.setAnnotations(as); 
            }
            match(input,65,FOLLOW_65_in_associationDefinition2458); if (state.failed) return n;
            pushFollow(FOLLOW_associationEnd_in_associationDefinition2466);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addEnd(ae); 
            }
            // Generator.g:568:5: (ae= associationEnd )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==IDENT||LA50_0==AT||LA50_0==57||(LA50_0>=59 && LA50_0<=60)||(LA50_0>=63 && LA50_0<=64)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Generator.g:568:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2478);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnd(ae); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            match(input,47,FOLLOW_47_in_associationDefinition2489); if (state.failed) return n;

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
    // $ANTLR end "associationDefinition"


    // $ANTLR start "associationEnd"
    // Generator.g:577:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;

        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as = null;

        ASTMultiplicity m = null;

        GeneratorParser.expression_return exp = null;

        List<ASTVariableDeclaration> qualifiers = null;


        try {
            // Generator.g:578:1: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // Generator.g:579:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd2514);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2522); if (state.failed) return n;
            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2524); if (state.failed) return n;
            pushFollow(FOLLOW_multiplicity_in_associationEnd2528);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2530); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationEnd(name, m); n.setAnnotations(as); 
            }
            // Generator.g:581:5: ( keyRole rn= IDENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IDENT) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==IDENT) ) {
                    int LA51_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt51=1;
                    }
                }
            }
            switch (alt51) {
                case 1 :
                    // Generator.g:581:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2541);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;
                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2545); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setRolename(rn); 
                    }

                    }
                    break;

            }

            // Generator.g:582:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop52:
            do {
                int alt52=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==EQUAL) ) {
                        alt52=5;
                    }
                    else if ( (LA52_2==LPAREN) ) {
                        alt52=6;
                    }
                    else if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt52=3;
                    }


                    }
                    break;
                case 66:
                    {
                    alt52=1;
                    }
                    break;
                case 67:
                    {
                    alt52=2;
                    }
                    break;
                case 68:
                    {
                    alt52=4;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // Generator.g:583:9: 'ordered'
            	    {
            	    match(input,66,FOLLOW_66_in_associationEnd2566); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setOrdered(); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:584:9: 'subsets' sr= IDENT
            	    {
            	    match(input,67,FOLLOW_67_in_associationEnd2578); if (state.failed) return n;
            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2582); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addSubsetsRolename(sr); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:585:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2594);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setUnion(true); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:586:9: 'redefines' rd= IDENT
            	    {
            	    match(input,68,FOLLOW_68_in_associationEnd2606); if (state.failed) return n;
            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2610); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRedefinesRolename(rd); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:587:9: keyDerived EQUAL exp= expression
            	    {
            	    pushFollow(FOLLOW_keyDerived_in_associationEnd2622);
            	    keyDerived();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2624); if (state.failed) return n;
            	    pushFollow(FOLLOW_expression_in_associationEnd2628);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setDerived((exp!=null?exp.n:null)); 
            	    }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:588:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2640);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    pushFollow(FOLLOW_paramList_in_associationEnd2646);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	      n.setQualifiers(qualifiers); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // Generator.g:590:5: ( SEMI )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==SEMI) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Generator.g:590:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2663); if (state.failed) return n;

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
    // $ANTLR end "associationEnd"


    // $ANTLR start "multiplicity"
    // Generator.g:604:1: multiplicity returns [ASTMultiplicity n] : mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;

        ASTMultiplicityRange mr = null;


        try {
            // Generator.g:605:1: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // Generator.g:606:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) {
               
              	Token t = input.LT(1); // remember start position of expression
              	n = new ASTMultiplicity(t);
                  
            }
            pushFollow(FOLLOW_multiplicityRange_in_multiplicity2698);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addRange(mr); 
            }
            // Generator.g:611:5: ( COMMA mr= multiplicityRange )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Generator.g:611:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity2708); if (state.failed) return n;
            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity2712);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRange(mr); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "multiplicity"


    // $ANTLR start "multiplicityRange"
    // Generator.g:614:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;

        int ms1 = 0;

        int ms2 = 0;


        try {
            // Generator.g:615:1: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // Generator.g:616:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2741);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTMultiplicityRange(ms1); 
            }
            // Generator.g:617:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOTDOT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Generator.g:617:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange2751); if (state.failed) return n;
                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2755);
                    ms2=multiplicitySpec();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setHigh(ms2); 
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
    // $ANTLR end "multiplicityRange"


    // $ANTLR start "multiplicitySpec"
    // Generator.g:620:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;

        Token i=null;

         m = -1; 
        try {
            // Generator.g:622:1: (i= INT | STAR )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==INT) ) {
                alt56=1;
            }
            else if ( (LA56_0==STAR) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // Generator.g:623:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec2789); if (state.failed) return m;
                    if ( state.backtracking==0 ) {
                       m = Integer.parseInt((i!=null?i.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:624:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec2799); if (state.failed) return m;
                    if ( state.backtracking==0 ) {
                       m = -1; 
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
        return m;
    }
    // $ANTLR end "multiplicitySpec"


    // $ANTLR start "invariant"
    // Generator.g:645:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;

        Token v=null;
        ASTSimpleType t = null;

        ASTInvariantClause inv = null;


        try {
            // Generator.g:646:1: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:647:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) {
               n = new ASTConstraintDefinition(); 
            }
            match(input,69,FOLLOW_69_in_invariant2840); if (state.failed) return n;
            // Generator.g:649:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==COMMA||LA58_1==COLON) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // Generator.g:649:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2850); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addVarName(v); 
                    }
                    // Generator.g:650:8: ( ',' v= IDENT )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // Generator.g:650:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2863); if (state.failed) return n;
                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2867); if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addVarName(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    match(input,COLON,FOLLOW_COLON_in_invariant2875); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_simpleType_in_invariant2887);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setType(t); 
            }
            // Generator.g:652:5: (inv= invariantClause )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=70 && LA59_0<=71)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Generator.g:652:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2899);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addInvariantClause(inv); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "invariant"


    // $ANTLR start "invariantClause"
    // Generator.g:659:1: invariantClause returns [ASTInvariantClause n] : ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;

        Token name=null;
        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:660:1: ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==70) ) {
                alt62=1;
            }
            else if ( (LA62_0==71) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // Generator.g:661:7: 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,70,FOLLOW_70_in_invariantClause2930); if (state.failed) return n;
                    // Generator.g:661:13: (name= IDENT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==IDENT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // Generator.g:661:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2936); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause2941); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause2945);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTInvariantClause(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:662:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,71,FOLLOW_71_in_invariantClause2955); if (state.failed) return n;
                    match(input,70,FOLLOW_70_in_invariantClause2957); if (state.failed) return n;
                    // Generator.g:662:27: (name= IDENT )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==IDENT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // Generator.g:662:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2963); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause2968); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause2972);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTExistentialInvariantClause(name, (e!=null?e.n:null)); 
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
    // $ANTLR end "invariantClause"


    // $ANTLR start "prePost"
    // Generator.g:673:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;

        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl = null;

        ASTType rt = null;

        ASTPrePostClause ppc = null;


        try {
            // Generator.g:674:1: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:675:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,69,FOLLOW_69_in_prePost2998); if (state.failed) return n;
            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3002); if (state.failed) return n;
            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3004); if (state.failed) return n;
            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3008); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_prePost3012);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:675:69: ( COLON rt= type )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COLON) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Generator.g:675:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost3016); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_prePost3020);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTPrePost(classname, opname, pl, rt); 
            }
            // Generator.g:677:5: (ppc= prePostClause )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=72 && LA64_0<=73)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Generator.g:677:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost3039);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // $ANTLR end "prePost"


    // $ANTLR start "prePostClause"
    // Generator.g:684:1: prePostClause returns [ASTPrePostClause n] : ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;

        Token name=null;
        GeneratorParser.expression_return e = null;


         Token t = null; 
        try {
            // Generator.g:686:1: ( ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:687:5: ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            if ( (input.LA(1)>=72 && input.LA(1)<=73) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // Generator.g:688:25: (name= IDENT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Generator.g:688:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3093); if (state.failed) return n;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_prePostClause3098); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_prePostClause3102);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTPrePostClause(t, name, (e!=null?e.n:null)); 
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
    // $ANTLR end "prePostClause"


    // $ANTLR start "annotationSet"
    // Generator.g:692:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;

        ASTAnnotation an = null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:694:1: ( (an= annotation )* )
            // Generator.g:695:2: (an= annotation )*
            {
            // Generator.g:695:2: (an= annotation )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==AT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // Generator.g:695:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3129);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;
            	    if ( state.backtracking==0 ) {
            	       annotations.add(an); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
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
        return annotations;
    }
    // $ANTLR end "annotationSet"


    // $ANTLR start "annotation"
    // Generator.g:698:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;

        Token name=null;
        Map<Token, Token> values = null;


        try {
            // Generator.g:698:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:699:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3148); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3152); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = new ASTAnnotation(name);
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3158); if (state.failed) return n;
            pushFollow(FOLLOW_annotationValues_in_annotation3167);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setValues(values); 
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3172); if (state.failed) return n;

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
    // $ANTLR end "annotation"


    // $ANTLR start "annotationValues"
    // Generator.g:705:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;

        GeneratorParser.annotationValue_return firstVal = null;

        GeneratorParser.annotationValue_return val = null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:707:1: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:708:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:708:2: (firstVal= annotationValue )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Generator.g:708:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3195);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;
                    if ( state.backtracking==0 ) {
                       values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); 
                    }

                    }
                    break;

            }

            // Generator.g:709:2: ( COMMA val= annotationValue )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Generator.g:709:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3203); if (state.failed) return values;
            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3207);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;
            	    if ( state.backtracking==0 ) {
            	       values.put((val!=null?val.name:null), (val!=null?val.value:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
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
        return values;
    }
    // $ANTLR end "annotationValues"

    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };

    // $ANTLR start "annotationValue"
    // Generator.g:712:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);

        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:712:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:713:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = aName; 
            }
            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3231); if (state.failed) return retval;
            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = aValue; 
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
    // $ANTLR end "annotationValue"


    // $ANTLR start "keyUnion"
    // Generator.g:718:1: keyUnion : {...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:718:9: ({...}? IDENT )
            // Generator.g:719:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyUnion3251); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyUnion"


    // $ANTLR start "keyAssociation"
    // Generator.g:721:1: keyAssociation : {...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:721:15: ({...}? IDENT )
            // Generator.g:722:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation3265); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyAssociation"


    // $ANTLR start "keyRole"
    // Generator.g:724:1: keyRole : {...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:724:8: ({...}? IDENT )
            // Generator.g:725:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyRole3279); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyRole"


    // $ANTLR start "keyComposition"
    // Generator.g:727:1: keyComposition : {...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:727:15: ({...}? IDENT )
            // Generator.g:728:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyComposition3291); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyComposition"


    // $ANTLR start "keyAggregation"
    // Generator.g:730:1: keyAggregation : {...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:730:15: ({...}? IDENT )
            // Generator.g:731:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3303); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyAggregation"


    // $ANTLR start "keyClass"
    // Generator.g:733:1: keyClass : {...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:733:9: ({...}? IDENT )
            // Generator.g:734:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyClass3317); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyClass"


    // $ANTLR start "keyDerived"
    // Generator.g:736:1: keyDerived : {...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:736:11: ({...}? IDENT )
            // Generator.g:737:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyDerived3329); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyDerived"


    // $ANTLR start "keyQualifier"
    // Generator.g:739:1: keyQualifier : {...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:739:13: ({...}? IDENT )
            // Generator.g:740:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3343); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyQualifier"


    // $ANTLR start "expressionOnly"
    // Generator.g:770:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        GeneratorParser.expression_return nExp = null;


        try {
            // Generator.g:771:1: (nExp= expression EOF )
            // Generator.g:772:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly3373);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly3375); if (state.failed) return n;
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
    // Generator.g:779:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final GeneratorParser.expression_return expression() throws RecognitionException {
        GeneratorParser.expression_return retval = new GeneratorParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Generator.g:785:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:786:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // Generator.g:787:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==74) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Generator.g:788:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,74,FOLLOW_74_in_expression3423); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3427); if (state.failed) return retval;
            	    // Generator.g:788:24: ( COLON t= type )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==COLON) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // Generator.g:788:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression3431); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression3435);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3440); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression3444);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,49,FOLLOW_49_in_expression3446); if (state.failed) return retval;
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
            	    break loop70;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3471);
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
    // Generator.g:816:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:818:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:819:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList3504); if (state.failed) return paramList;
            // Generator.g:820:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==IDENT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // Generator.g:821:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList3521);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // Generator.g:822:7: ( COMMA v= variableDeclaration )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==COMMA) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // Generator.g:822:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList3533); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList3537);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList3557); if (state.failed) return paramList;

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
    // Generator.g:830:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:832:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:833:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3586); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // Generator.g:834:5: ( COMMA idn= IDENT )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Generator.g:834:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList3596); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3600); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // Generator.g:842:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Generator.g:843:1: (name= IDENT COLON t= type )
            // Generator.g:844:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3631); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration3633); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration3637);
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
    // Generator.g:852:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:853:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:854:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3673);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // Generator.g:855:5: (op= 'implies' n1= conditionalOrExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==75) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // Generator.g:855:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,75,FOLLOW_75_in_conditionalImpliesExpression3686); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3690);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "conditionalImpliesExpression"


    // $ANTLR start "conditionalOrExpression"
    // Generator.g:864:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:865:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:866:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3735);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // Generator.g:867:5: (op= 'or' n1= conditionalXOrExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==76) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // Generator.g:867:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,76,FOLLOW_76_in_conditionalOrExpression3748); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3752);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalXOrExpression"
    // Generator.g:876:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:877:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:878:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3796);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // Generator.g:879:5: (op= 'xor' n1= conditionalAndExpression )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==77) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Generator.g:879:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,77,FOLLOW_77_in_conditionalXOrExpression3809); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3813);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // Generator.g:888:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:889:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:890:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3857);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // Generator.g:891:5: (op= 'and' n1= equalityExpression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==78) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Generator.g:891:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,78,FOLLOW_78_in_conditionalAndExpression3870); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3874);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "equalityExpression"
    // Generator.g:900:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:902:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:903:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3922);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // Generator.g:904:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==EQUAL||LA78_0==NOT_EQUAL) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Generator.g:904:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3951);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "equalityExpression"


    // $ANTLR start "relationalExpression"
    // Generator.g:914:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:916:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:917:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression4000);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // Generator.g:918:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==LESS||(LA79_0>=GREATER && LA79_0<=GREATER_EQUAL)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Generator.g:918:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==LESS||(input.LA(1)>=GREATER && input.LA(1)<=GREATER_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression4036);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
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
    // Generator.g:928:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:930:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:931:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4086);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // Generator.g:932:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=PLUS && LA80_0<=MINUS)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // Generator.g:932:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4114);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // Generator.g:943:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:945:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:946:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4164);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // Generator.g:947:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==STAR||LA81_0==SLASH||LA81_0==79) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Generator.g:947:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==STAR||input.LA(1)==SLASH||input.LA(1)==79 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4196);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // Generator.g:959:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // Generator.g:961:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=PLUS && LA82_0<=MINUS)||LA82_0==80) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=IDENT && LA82_0<=LPAREN)||LA82_0==INT||LA82_0==AT||(LA82_0>=REAL && LA82_0<=HASH)||LA82_0==50||(LA82_0>=82 && LA82_0<=85)||(LA82_0>=87 && LA82_0<=99)) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // Generator.g:962:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:962:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:962:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==80 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4282);
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
                    // Generator.g:966:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4302);
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
    // Generator.g:974:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // Generator.g:976:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:977:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression4335);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // Generator.g:978:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==DOT) ) {
                    int LA84_2 = input.LA(2);

                    if ( (LA84_2==IDENT) ) {
                        int LA84_4 = input.LA(3);

                        if ( (LA84_4==EOF||(LA84_4>=IDENT && LA84_4<=COMMA)||(LA84_4>=DOT && LA84_4<=RBRACK)||(LA84_4>=LBRACE && LA84_4<=LESS)||(LA84_4>=EQUAL && LA84_4<=DOTDOT)||(LA84_4>=STAR && LA84_4<=AT)||(LA84_4>=NOT_EQUAL && LA84_4<=BAR)||LA84_4==47||LA84_4==49||(LA84_4>=51 && LA84_4<=52)||LA84_4==58||(LA84_4>=60 && LA84_4<=64)||(LA84_4>=66 && LA84_4<=73)||(LA84_4>=75 && LA84_4<=79)||LA84_4==86||LA84_4==106) ) {
                            alt84=1;
                        }


                    }
                    else if ( ((LA84_2>=82 && LA84_2<=85)) ) {
                        alt84=1;
                    }


                }
                else if ( (LA84_0==ARROW) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Generator.g:979:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:979:6: ( ARROW | DOT )
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==ARROW) ) {
            	        alt83=1;
            	    }
            	    else if ( (LA83_0==DOT) ) {
            	        alt83=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 83, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // Generator.g:979:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression4353); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:979:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression4359); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression4370);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
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
    // Generator.g:995:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        GeneratorParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // Generator.g:996:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt87=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
                {
                alt87=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt87=1;
                    }
                    break;
                case EOF:
                case IDENT:
                case LPAREN:
                case RPAREN:
                case SEMI:
                case COMMA:
                case LBRACK:
                case RBRACK:
                case LBRACE:
                case RBRACE:
                case LESS:
                case EQUAL:
                case DOTDOT:
                case STAR:
                case AT:
                case NOT_EQUAL:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case PLUS:
                case MINUS:
                case SLASH:
                case ARROW:
                case BAR:
                case 47:
                case 49:
                case 51:
                case 52:
                case 58:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 86:
                case 106:
                    {
                    alt87=3;
                    }
                    break;
                case DOT:
                    {
                    int LA87_7 = input.LA(3);

                    if ( (LA87_7==81) ) {
                        alt87=6;
                    }
                    else if ( (LA87_7==IDENT||(LA87_7>=82 && LA87_7<=85)) ) {
                        alt87=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt87=2;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt87=3;
                }
                break;
            case LPAREN:
                {
                alt87=4;
                }
                break;
            case 50:
                {
                alt87=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // Generator.g:997:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4410);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:998:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression4424);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:999:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression4436);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1000:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4447); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression4451);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4453); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:1001:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression4465);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:1002:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4477); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4479); if (state.failed) return n;
                    match(input,81,FOLLOW_81_in_primaryExpression4481); if (state.failed) return n;
                    // Generator.g:1002:36: ( LPAREN RPAREN )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==LPAREN) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // Generator.g:1002:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4485); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4487); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // Generator.g:1004:7: ( AT 'pre' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==72) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // Generator.g:1004:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4508); if (state.failed) return n;
                            match(input,72,FOLLOW_72_in_primaryExpression4510); if (state.failed) return n;
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
    // Generator.g:1008:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // Generator.g:1009:1: ( AT objectName= IDENT )
            // Generator.g:1010:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference4537); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4545); if (state.failed) return n;
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
    // Generator.g:1024:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        GeneratorParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // Generator.g:1025:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt88=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA88_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt88=1;
                }
                else if ( (true) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
                }
                break;
            case 82:
                {
                alt88=2;
                }
                break;
            case 83:
            case 84:
            case 85:
                {
                alt88=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // Generator.g:1029:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall4610);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1032:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall4623);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1033:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall4636);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1034:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall4649);
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
    // Generator.g:1043:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        GeneratorParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1044:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1045:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression4684); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression4691); if (state.failed) return n;
            // Generator.g:1047:5: (decls= elemVarsDeclaration BAR )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==IDENT) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==COMMA||LA89_1==COLON||LA89_1==BAR) ) {
                    alt89=1;
                }
            }
            switch (alt89) {
                case 1 :
                    // Generator.g:1047:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression4702);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression4706); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression4717);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4723); if (state.failed) return n;
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
    // Generator.g:1061:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        GeneratorParser.expression_return nExp = null;


        try {
            // Generator.g:1061:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1062:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,82,FOLLOW_82_in_iterateExpression4755); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4761); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4769);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4771); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4779);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression4781); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression4789);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4795); if (state.failed) return n;
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
    // Generator.g:1083:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        GeneratorParser.expression_return rolename = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1085:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1086:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4839); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // Generator.g:1092:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LBRACK) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Generator.g:1092:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4861); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression4874);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // Generator.g:1094:9: ( COMMA rolename= expression )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==COMMA) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // Generator.g:1094:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4887); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression4891);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4903); if (state.failed) return retval;
                    // Generator.g:1097:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LBRACK) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Generator.g:1097:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4920); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression4935);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // Generator.g:1099:11: ( COMMA rolename= expression )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==COMMA) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // Generator.g:1099:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4950); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression4954);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4968); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // Generator.g:1104:5: ( AT 'pre' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==AT) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==72) ) {
                    alt94=1;
                }
            }
            switch (alt94) {
                case 1 :
                    // Generator.g:1104:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression4993); if (state.failed) return retval;
                    match(input,72,FOLLOW_72_in_operationExpression4995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // Generator.g:1105:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LPAREN) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Generator.g:1106:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression5015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // Generator.g:1107:7: (e= expression ( COMMA e= expression )* )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( ((LA96_0>=IDENT && LA96_0<=LPAREN)||LA96_0==INT||LA96_0==AT||(LA96_0>=PLUS && LA96_0<=MINUS)||(LA96_0>=REAL && LA96_0<=HASH)||LA96_0==50||LA96_0==74||LA96_0==80||(LA96_0>=82 && LA96_0<=85)||(LA96_0>=87 && LA96_0<=99)) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Generator.g:1108:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression5036);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // Generator.g:1109:7: ( COMMA e= expression )*
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( (LA95_0==COMMA) ) {
                                    alt95=1;
                                }


                                switch (alt95) {
                            	case 1 :
                            	    // Generator.g:1109:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5048); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression5052);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop95;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression5072); if (state.failed) return retval;

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
    // Generator.g:1122:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // Generator.g:1125:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // Generator.g:1126:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=83 && input.LA(1)<=85) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5137); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression5141);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5143); if (state.failed) return n;
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
    // Generator.g:1137:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        Token var1=null;
        Token varN=null;
        ASTType t = null;

        ASTType tN = null;


        try {
            // Generator.g:1138:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Generator.g:1139:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) {
               n = new ASTElemVarsDeclaration(); 
            }
            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5181); if (state.failed) return n;
            // Generator.g:1140:17: ( COLON t= type )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==COLON) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Generator.g:1140:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5184); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration5188);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              n.addDeclaration(var1, t);
            }
            // Generator.g:1141:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==COMMA) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // Generator.g:1141:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration5198); if (state.failed) return n;
            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5204); if (state.failed) return n;
            	    // Generator.g:1141:24: ( COLON tN= type )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==COLON) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // Generator.g:1141:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5207); if (state.failed) return n;
            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration5213);
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
            	    break loop100;
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
    // Generator.g:1149:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1150:1: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1151:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization5241); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization5243); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization5247);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization5249); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization5253);
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
    // Generator.g:1160:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        GeneratorParser.expression_return cond = null;

        GeneratorParser.expression_return t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1161:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1162:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,50,FOLLOW_50_in_ifExpression5285); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5289);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,51,FOLLOW_51_in_ifExpression5291); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5295);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,52,FOLLOW_52_in_ifExpression5297); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5301);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,86,FOLLOW_86_in_ifExpression5303); if (state.failed) return n;
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
    // Generator.g:1182:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
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
            // Generator.g:1183:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt101=12;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // Generator.g:1184:7: t= 'true'
                    {
                    t=(Token)match(input,87,FOLLOW_87_in_literal5342); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1185:7: f= 'false'
                    {
                    f=(Token)match(input,88,FOLLOW_88_in_literal5356); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1186:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal5369); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1187:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5384); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:1188:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5398); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:1189:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal5408); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5412); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:1190:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5424); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5426); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5430); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:1191:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal5442);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // Generator.g:1192:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5454);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // Generator.g:1193:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal5466);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // Generator.g:1194:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal5478);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // Generator.g:1195:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal5490);
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
    // Generator.g:1203:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // Generator.g:1205:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1206:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=89 && input.LA(1)<=92) ) {
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
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral5557); if (state.failed) return n;
            // Generator.g:1210:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=IDENT && LA103_0<=LPAREN)||LA103_0==INT||LA103_0==AT||(LA103_0>=PLUS && LA103_0<=MINUS)||(LA103_0>=REAL && LA103_0<=HASH)||LA103_0==50||LA103_0==74||LA103_0==80||(LA103_0>=82 && LA103_0<=85)||(LA103_0>=87 && LA103_0<=99)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // Generator.g:1211:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5574);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // Generator.g:1212:7: ( COMMA ci= collectionItem )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==COMMA) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // Generator.g:1212:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral5587); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5591);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral5610); if (state.failed) return n;

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
    // Generator.g:1221:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        GeneratorParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1223:1: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1224:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem5639);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // Generator.g:1225:5: ( DOTDOT e= expression )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==DOTDOT) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Generator.g:1225:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem5650); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem5654);
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
    // Generator.g:1235:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // Generator.g:1236:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==93) ) {
                alt105=1;
            }
            else if ( ((LA105_0>=89 && LA105_0<=92)||LA105_0==99) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // Generator.g:1237:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,93,FOLLOW_93_in_emptyCollectionLiteral5683); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral5685); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5689);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral5691); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1240:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5707);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral5709); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral5711); if (state.failed) return n;
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
    // Generator.g:1251:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // Generator.g:1252:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt106=1;
                }
                break;
            case 95:
                {
                alt106=2;
                }
                break;
            case 96:
                {
                int LA106_3 = input.LA(2);

                if ( (LA106_3==LPAREN) ) {
                    alt106=3;
                }
                else if ( (LA106_3==EOF||LA106_3==IDENT||(LA106_3>=RPAREN && LA106_3<=COMMA)||LA106_3==DOT||LA106_3==RBRACK||(LA106_3>=LBRACE && LA106_3<=LESS)||(LA106_3>=EQUAL && LA106_3<=DOTDOT)||(LA106_3>=STAR && LA106_3<=AT)||(LA106_3>=NOT_EQUAL && LA106_3<=BAR)||LA106_3==47||LA106_3==49||(LA106_3>=51 && LA106_3<=52)||LA106_3==58||(LA106_3>=60 && LA106_3<=64)||(LA106_3>=66 && LA106_3<=73)||(LA106_3>=75 && LA106_3<=79)||LA106_3==86||LA106_3==106) ) {
                    alt106=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // Generator.g:1253:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,94,FOLLOW_94_in_undefinedLiteral5741); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5743); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral5747);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5749); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1256:5: 'Undefined'
                    {
                    match(input,95,FOLLOW_95_in_undefinedLiteral5763); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1259:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,96,FOLLOW_96_in_undefinedLiteral5777); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5779); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral5783);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5785); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1262:5: 'null'
                    {
                    match(input,96,FOLLOW_96_in_undefinedLiteral5799); if (state.failed) return n;
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
    // Generator.g:1272:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1274:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1275:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,97,FOLLOW_97_in_tupleLiteral5838); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5844); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5852);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // Generator.g:1278:5: ( COMMA ti= tupleItem )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==COMMA) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // Generator.g:1278:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5863); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5867);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5878); if (state.failed) return n;
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
    // Generator.g:1286:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1287:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1288:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5909); if (state.failed) return n;
            // Generator.g:1289:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==COLON) ) {
                int LA108_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt108=1;
                }
                else if ( (true) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA108_0==EQUAL) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // Generator.g:1292:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem5948); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem5952);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem5954); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem5958);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1295:7: ( COLON | EQUAL ) e= expression
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

                    pushFollow(FOLLOW_expression_in_tupleItem5990);
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
    // Generator.g:1304:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // Generator.g:1305:1: ( 'Date' LBRACE v= STRING RBRACE )
            // Generator.g:1306:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,98,FOLLOW_98_in_dateLiteral6035); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral6037); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral6041); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral6043); if (state.failed) return n;
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
    // Generator.g:1316:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // Generator.g:1318:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // Generator.g:1319:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // Generator.g:1320:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt109=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt109=1;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
            case 99:
                {
                alt109=2;
                }
                break;
            case 97:
                {
                alt109=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // Generator.g:1321:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type6093);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1322:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type6105);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1323:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type6117);
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
    // Generator.g:1328:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // Generator.g:1329:1: (nT= type EOF )
            // Generator.g:1330:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly6149);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly6151); if (state.failed) return n;
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
    // Generator.g:1340:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // Generator.g:1341:1: (name= IDENT )
            // Generator.g:1342:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6179); if (state.failed) return n;
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
    // Generator.g:1350:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // Generator.g:1352:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1353:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=89 && input.LA(1)<=92)||input.LA(1)==99 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType6244); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType6248);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType6250); if (state.failed) return n;
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
    // Generator.g:1363:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1365:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1366:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,97,FOLLOW_97_in_tupleType6284); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType6286); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType6295);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // Generator.g:1368:5: ( COMMA tp= tuplePart )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Generator.g:1368:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType6306); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType6310);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType6322); if (state.failed) return n;
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
    // Generator.g:1377:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Generator.g:1378:1: (name= IDENT COLON t= type )
            // Generator.g:1379:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6354); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart6356); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart6360);
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


    // $ANTLR start "statOnly"
    // Generator.g:1418:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1419:1: (s= stat EOF )
            // Generator.g:1420:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly6409);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly6413); if (state.failed) return n;
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
    // Generator.g:1430:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // Generator.g:1434:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // Generator.g:1435:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat6444);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // Generator.g:1436:3: ( SEMI nextStat[seq] )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==SEMI) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // Generator.g:1437:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat6455); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat6461);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop111;
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
    // Generator.g:1453:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final GeneratorParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        GeneratorParser.nextStat_return retval = new GeneratorParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // Generator.g:1454:1: (s= singleStat )
            // Generator.g:1455:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat6495);
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
    // Generator.g:1467:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        GeneratorParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // Generator.g:1471:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt112=10;
            alt112 = dfa112.predict(input);
            switch (alt112) {
                case 1 :
                    // Generator.g:1472:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat6532);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1474:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6558);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1475:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat6570);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1476:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat6584);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:1477:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat6598);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:1478:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat6611);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:1479:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat6628);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:1480:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat6645);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // Generator.g:1481:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat6662);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // Generator.g:1483:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat6684);
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
    // Generator.g:1490:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // Generator.g:1491:1: ( nothing )
            // Generator.g:1492:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat6711);
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
    // Generator.g:1497:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // Generator.g:1498:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1499:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6737);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1500:3: (aas= attAssignStat[$expr.n] )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==DOT) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Generator.g:1501:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6751);
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
    // Generator.g:1513:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        GeneratorParser.rValue_return rVal = null;


        try {
            // Generator.g:1514:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1515:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6789); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6793); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat6801);
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
    // Generator.g:1583:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        GeneratorParser.rValue_return r = null;


        try {
            // Generator.g:1584:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1585:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6832); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6841); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6845); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat6853);
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
    // Generator.g:1597:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1598:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1599:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,100,FOLLOW_100_in_objCreateStat6879); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat6887);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1601:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==LPAREN) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // Generator.g:1602:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6897); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6909);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6915); if (state.failed) return n;

                    }
                    break;

            }

            // Generator.g:1607:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==65) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // Generator.g:1608:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,65,FOLLOW_65_in_objCreateStat6933); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6941); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6955);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6963); if (state.failed) return n;
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
    // Generator.g:1627:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // Generator.g:1628:1: ( 'destroy' el= exprListMin1 )
            // Generator.g:1629:3: 'destroy' el= exprListMin1
            {
            match(input,101,FOLLOW_101_in_objDestroyStat6999); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat7007);
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
    // Generator.g:1650:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1651:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1652:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,102,FOLLOW_102_in_lnkInsStat7033); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat7037); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7047);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat7051); if (state.failed) return n;
            match(input,103,FOLLOW_103_in_lnkInsStat7055); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat7063); if (state.failed) return n;
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
    // Generator.g:1662:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        GeneratorParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1668:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1669:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7092);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Generator.g:1670:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==LBRACE) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // Generator.g:1671:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7103); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7112);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7119); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7135); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7146);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Generator.g:1683:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==LBRACE) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Generator.g:1684:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7157); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7166);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7173); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // Generator.g:1693:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Generator.g:1694:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7195); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7210);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // Generator.g:1698:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==LBRACE) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // Generator.g:1699:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7230); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7241);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7250); if (state.failed) return retval;

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
            	    break loop119;
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
    // Generator.g:1714:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1715:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1716:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,104,FOLLOW_104_in_lnkDelStat7291); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat7295); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7305);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat7309); if (state.failed) return n;
            match(input,105,FOLLOW_105_in_lnkDelStat7313); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat7322); if (state.failed) return n;
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
    // Generator.g:1730:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        GeneratorParser.stat_return ts = null;

        GeneratorParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1734:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // Generator.g:1735:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,50,FOLLOW_50_in_condExStat7353); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat7362);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,51,FOLLOW_51_in_condExStat7366); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat7375);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1739:3: ( 'else' es= stat )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==52) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // Generator.g:1740:5: 'else' es= stat
                    {
                    match(input,52,FOLLOW_52_in_condExStat7386); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat7398);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_condExStat7409); if (state.failed) return n;
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
    // Generator.g:1751:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1752:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // Generator.g:1753:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,48,FOLLOW_48_in_iterStat7434); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7442); if (state.failed) return n;
            match(input,49,FOLLOW_49_in_iterStat7446); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat7454);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,106,FOLLOW_106_in_iterStat7458); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat7466);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,47,FOLLOW_47_in_iterStat7470); if (state.failed) return n;
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
    // Generator.g:1768:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1769:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // Generator.g:1770:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,107,FOLLOW_107_in_whileStat7496); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat7504);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,106,FOLLOW_106_in_whileStat7508); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat7516);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,47,FOLLOW_47_in_whileStat7520); if (state.failed) return n;
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
    // Generator.g:1793:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:1794:1: ()
            // Generator.g:1795:1: 
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
    // Generator.g:1801:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final GeneratorParser.rValue_return rValue() throws RecognitionException {
        GeneratorParser.rValue_return retval = new GeneratorParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // Generator.g:1802:1: (e= inSoilExpression | oc= objCreateStat )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=IDENT && LA121_0<=LPAREN)||LA121_0==INT||LA121_0==AT||(LA121_0>=PLUS && LA121_0<=MINUS)||(LA121_0>=REAL && LA121_0<=HASH)||LA121_0==50||LA121_0==74||LA121_0==80||(LA121_0>=82 && LA121_0<=85)||(LA121_0>=87 && LA121_0<=99)) ) {
                alt121=1;
            }
            else if ( (LA121_0==100) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // Generator.g:1803:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7573);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1804:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7585);
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
    // Generator.g:1818:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // Generator.g:1819:1: ( nothing | rl= rValListMin1 )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RBRACE) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=IDENT && LA122_0<=LPAREN)||LA122_0==INT||LA122_0==AT||(LA122_0>=PLUS && LA122_0<=MINUS)||(LA122_0>=REAL && LA122_0<=HASH)||LA122_0==50||LA122_0==74||LA122_0==80||(LA122_0>=82 && LA122_0<=85)||(LA122_0>=87 && LA122_0<=100)) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // Generator.g:1820:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7608);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1823:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7635);
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
    // Generator.g:1831:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        GeneratorParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1835:1: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:1836:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17668);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Generator.g:1838:3: ( COMMA r= rValue )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // Generator.g:1839:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17682); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin17692);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop123;
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
    // Generator.g:1849:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        GeneratorParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1853:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:1854:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27731);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27739); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin27747);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Generator.g:1859:3: ( COMMA r= rValue )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // Generator.g:1860:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27761); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin27771);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop124;
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
    // Generator.g:1870:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1871:1: (e= expression )
            // Generator.g:1872:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression7805);
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
    // Generator.g:1881:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // Generator.g:1882:1: ( nothing | el= exprListMin1 )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==EOF) ) {
                alt125=1;
            }
            else if ( ((LA125_0>=IDENT && LA125_0<=LPAREN)||LA125_0==INT||LA125_0==AT||(LA125_0>=PLUS && LA125_0<=MINUS)||(LA125_0>=REAL && LA125_0<=HASH)||LA125_0==50||LA125_0==74||LA125_0==80||(LA125_0>=82 && LA125_0<=85)||(LA125_0>=87 && LA125_0<=99)) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // Generator.g:1883:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList7834);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1886:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList7852);
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
    // Generator.g:1894:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1898:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1899:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin17885);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Generator.g:1901:3: ( COMMA e= inSoilExpression )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==COMMA) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // Generator.g:1902:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin17900); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin17910);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop126;
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
    // Generator.g:1912:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1916:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1917:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27950);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin27958); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27966);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Generator.g:1922:3: ( COMMA e= inSoilExpression )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // Generator.g:1923:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin27980); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin27990);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop127;
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
    // Generator.g:1933:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // Generator.g:1934:1: ( nothing | il= identListMin1 )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==EOF||LA128_0==SEMI||LA128_0==RBRACE||LA128_0==47||LA128_0==52) ) {
                alt128=1;
            }
            else if ( (LA128_0==IDENT) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // Generator.g:1935:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList8020);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1938:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList8037);
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
    // Generator.g:1946:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:1950:1: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:1951:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18071); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // Generator.g:1953:3: ( COMMA id= IDENT )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==COMMA) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // Generator.g:1954:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin18085); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18095); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop129;
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

    // $ANTLR start synpred1_Generator
    public final void synpred1_Generator_fragment() throws RecognitionException {   
        // Generator.g:1292:7: ( COLON type EQUAL )
        // Generator.g:1292:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator5939); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_Generator5941);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator5943); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {   
        // Generator.g:1474:5: ( statStartingWithExpr )
        // Generator.g:1474:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator6550);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Generator

    // Delegated rules

    public final boolean synpred2_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA112 dfa112 = new DFA112(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\4\1\5\11\uffff";
    static final String DFA7_maxS =
        "\1\70\1\11\11\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\1\1\4";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\6\uffff\1\2\44\uffff\1\3\1\uffff\1\4\2\uffff\1\5\1\6\1"+
            "\7\1\10",
            "\1\12\3\uffff\1\11",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "193:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit | instrBA= barrier );";
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\1\2\15\uffff";
    static final String DFA20_minS =
        "\2\4\2\uffff\1\5\1\4\1\22\2\4\1\27\1\22\1\6\1\27\1\6";
    static final String DFA20_maxS =
        "\1\100\1\4\2\uffff\1\5\1\10\1\22\1\4\1\100\1\27\1\22\1\10\1\27\1"+
        "\10";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\1\12\uffff";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\21\uffff\1\1\43\uffff\1\2\1\3\1\2\2\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6\1\uffff\1\10\1\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\2\21\uffff\1\1\44\uffff\1\3\1\2\2\uffff\2\2",
            "\1\13",
            "\1\14",
            "\1\10\1\uffff\1\7",
            "\1\15",
            "\1\10\1\uffff\1\7"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 396:5: (e= enumTypeDefinition )*";
        }
    }
    static final String DFA22_eotS =
        "\24\uffff";
    static final String DFA22_eofS =
        "\1\1\23\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\1\20\1\4\1\uffff\1\22\2"+
        "\4\1\27\1\22\1\4\1\6\1\27\1\20\1\6";
    static final String DFA22_maxS =
        "\1\100\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\1\101\1\10\1\uffff\1"+
        "\22\1\4\1\100\1\27\1\22\1\4\1\10\1\27\1\101\1\10";
    static final String DFA22_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\12\uffff";
    static final String DFA22_specialS =
        "\24\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\4\21\uffff\1\2\43\uffff\1\5\1\uffff\1\3\2\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\3\36\uffff\1\3\12\uffff\1\3\2\uffff\2\3\2\uffff\1\11",
            "\1\12\1\uffff\1\14\1\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\21\uffff\1\2\45\uffff\1\3\2\uffff\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\14\1\uffff\1\13",
            "\1\23",
            "\1\3\36\uffff\1\3\12\uffff\1\3\2\uffff\2\3\2\uffff\1\11",
            "\1\14\1\uffff\1\13"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 397:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*";
        }
    }
    static final String DFA101_eotS =
        "\16\uffff";
    static final String DFA101_eofS =
        "\16\uffff";
    static final String DFA101_minS =
        "\1\4\7\uffff\1\5\5\uffff";
    static final String DFA101_maxS =
        "\1\143\7\uffff\1\16\5\uffff";
    static final String DFA101_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA101_specialS =
        "\16\uffff}>";
    static final String[] DFA101_transitionS = {
            "\1\7\17\uffff\1\3\14\uffff\1\4\1\5\1\6\63\uffff\1\1\1\2\4\10"+
            "\1\11\3\12\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\10\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
    static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
    static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
    static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
    static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
    static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
    static final short[][] DFA101_transition;

    static {
        int numStates = DFA101_transitionS.length;
        DFA101_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = DFA101_eot;
            this.eof = DFA101_eof;
            this.min = DFA101_min;
            this.max = DFA101_max;
            this.accept = DFA101_accept;
            this.special = DFA101_special;
            this.transition = DFA101_transition;
        }
        public String getDescription() {
            return "1182:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
    static final String DFA112_eotS =
        "\43\uffff";
    static final String DFA112_eofS =
        "\1\1\42\uffff";
    static final String DFA112_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA112_maxS =
        "\1\153\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\1\3\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA112_specialS =
        "\1\0\14\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA112_transitionS = {
            "\1\15\1\31\1\uffff\1\1\14\uffff\1\11\1\uffff\1\26\5\uffff\2"+
            "\6\3\uffff\1\12\1\13\1\14\13\uffff\1\1\1\37\1\uffff\1\32\1\uffff"+
            "\1\1\25\uffff\1\5\5\uffff\1\6\1\uffff\1\27\3\30\1\uffff\1\7"+
            "\1\10\4\16\1\17\1\21\1\22\1\23\1\24\1\25\1\20\1\33\1\34\1\35"+
            "\1\uffff\1\36\2\uffff\1\40",
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

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "1467:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_0 = input.LA(1);

                         
                        int index112_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA112_0==EOF||LA112_0==SEMI||LA112_0==47||LA112_0==52) ) {s = 1;}

                        else if ( (LA112_0==74) && (synpred2_Generator())) {s = 5;}

                        else if ( ((LA112_0>=PLUS && LA112_0<=MINUS)||LA112_0==80) && (synpred2_Generator())) {s = 6;}

                        else if ( (LA112_0==87) && (synpred2_Generator())) {s = 7;}

                        else if ( (LA112_0==88) && (synpred2_Generator())) {s = 8;}

                        else if ( (LA112_0==INT) && (synpred2_Generator())) {s = 9;}

                        else if ( (LA112_0==REAL) && (synpred2_Generator())) {s = 10;}

                        else if ( (LA112_0==STRING) && (synpred2_Generator())) {s = 11;}

                        else if ( (LA112_0==HASH) && (synpred2_Generator())) {s = 12;}

                        else if ( (LA112_0==IDENT) ) {s = 13;}

                        else if ( ((LA112_0>=89 && LA112_0<=92)) && (synpred2_Generator())) {s = 14;}

                        else if ( (LA112_0==93) && (synpred2_Generator())) {s = 15;}

                        else if ( (LA112_0==99) && (synpred2_Generator())) {s = 16;}

                        else if ( (LA112_0==94) && (synpred2_Generator())) {s = 17;}

                        else if ( (LA112_0==95) && (synpred2_Generator())) {s = 18;}

                        else if ( (LA112_0==96) && (synpred2_Generator())) {s = 19;}

                        else if ( (LA112_0==97) && (synpred2_Generator())) {s = 20;}

                        else if ( (LA112_0==98) && (synpred2_Generator())) {s = 21;}

                        else if ( (LA112_0==AT) && (synpred2_Generator())) {s = 22;}

                        else if ( (LA112_0==82) && (synpred2_Generator())) {s = 23;}

                        else if ( ((LA112_0>=83 && LA112_0<=85)) && (synpred2_Generator())) {s = 24;}

                        else if ( (LA112_0==LPAREN) && (synpred2_Generator())) {s = 25;}

                        else if ( (LA112_0==50) ) {s = 26;}

                        else if ( (LA112_0==100) ) {s = 27;}

                        else if ( (LA112_0==101) ) {s = 28;}

                        else if ( (LA112_0==102) ) {s = 29;}

                        else if ( (LA112_0==104) ) {s = 30;}

                        else if ( (LA112_0==48) ) {s = 31;}

                        else if ( (LA112_0==107) ) {s = 32;}

                         
                        input.seek(index112_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_13 = input.LA(1);

                         
                        int index112_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Generator()) ) {s = 25;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index112_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA112_26 = input.LA(1);

                         
                        int index112_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Generator()) ) {s = 25;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index112_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_procedure179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_procedure199 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure214 = new BitSet(new long[]{0x01E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure220 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x01E5000000000812L});
    public static final BitSet FOLLOW_variableAssignment_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeAssignment_in_instruction371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifThenElse_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asslCall_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opEnter_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opExit_in_instruction465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_barrier_in_instruction482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableAssignment513 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_variableAssignment515 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_valueInstruction_in_variableAssignment519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_attributeAssignment551 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_attributeAssignment553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attributeAssignment557 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attributeAssignment565 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_valueInstruction_in_attributeAssignment569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_loop601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_loop607 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_loop613 = new BitSet(new long[]{0x01E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ifThenElse662 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifThenElse677 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ifThenElse679 = new BitSet(new long[]{0x01E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifThenElse685 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ifThenElse696 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ifThenElse698 = new BitSet(new long[]{0x01E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_valueInstruction758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomicInstruction788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_atomicInstruction792 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction806 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_atomicInstruction824 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction828 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_atomicInstruction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_asslCall899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_asslCall903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_asslCall907 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall921 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_asslCall939 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall943 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_asslCall991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_opEnter1014 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_opEnter1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_opEnter1026 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1041 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_opEnter1059 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1063 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_opEnter1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_opExit1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_instructionParameter1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_oclExpression1235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RBRACK_in_oclExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_barrier1265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_barrier1270 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_IDENT_in_barrier1285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_COLON_in_barrier1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_barrier1293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_oclExpression_in_barrier1309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_barrier1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x0004000E30500070L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1426 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_model1432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_model1436 = new BitSet(new long[]{0x9C00000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1448 = new BitSet(new long[]{0x9C00000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalClassDefinition_in_model1465 = new BitSet(new long[]{0x9400000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_associationDefinition_in_model1482 = new BitSet(new long[]{0x9400000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_58_in_model1498 = new BitSet(new long[]{0x9400000000400010L,0x0000000000000021L});
    public static final BitSet FOLLOW_invariant_in_model1516 = new BitSet(new long[]{0x9400000000400010L,0x0000000000000021L});
    public static final BitSet FOLLOW_prePost_in_model1537 = new BitSet(new long[]{0x9400000000400010L,0x0000000000000021L});
    public static final BitSet FOLLOW_EOF_in_model1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1606 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_enumTypeDefinition1612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1622 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1624 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassDefinition1666 = new BitSet(new long[]{0x9000000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_generalClassDefinition1674 = new BitSet(new long[]{0x9000000000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassDefinition1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassDefinition1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1755 = new BitSet(new long[]{0x6400800000010000L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_classDefinition1769 = new BitSet(new long[]{0x6400800000000000L});
    public static final BitSet FOLLOW_61_in_classDefinition1782 = new BitSet(new long[]{0x4400800000400010L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1795 = new BitSet(new long[]{0x4400800000400010L});
    public static final BitSet FOLLOW_62_in_classDefinition1816 = new BitSet(new long[]{0x0400800000400010L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1829 = new BitSet(new long[]{0x0400800000400010L});
    public static final BitSet FOLLOW_58_in_classDefinition1850 = new BitSet(new long[]{0x0000800000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1870 = new BitSet(new long[]{0x0000800000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_47_in_classDefinition1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition1927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition1953 = new BitSet(new long[]{0x6400800000410010L,0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition1967 = new BitSet(new long[]{0x6400800000400010L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_associationClassDefinition1979 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1987 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1999 = new BitSet(new long[]{0x6400800000400010L});
    public static final BitSet FOLLOW_61_in_associationClassDefinition2019 = new BitSet(new long[]{0x4400800000400010L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2032 = new BitSet(new long[]{0x4400800000400010L});
    public static final BitSet FOLLOW_62_in_associationClassDefinition2053 = new BitSet(new long[]{0x0400800000400010L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2066 = new BitSet(new long[]{0x0400800000400010L});
    public static final BitSet FOLLOW_58_in_associationClassDefinition2087 = new BitSet(new long[]{0x0000800000400010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2107 = new BitSet(new long[]{0x0000800000400010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2143 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2147 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_associationClassDefinition2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2206 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2208 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2212 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2273 = new BitSet(new long[]{0x0000400000060082L,0x0000000000000300L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2287 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2293 = new BitSet(new long[]{0x0000400000040082L,0x0000000000000300L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2321 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2327 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000300L});
    public static final BitSet FOLLOW_46_in_operationDefinition2345 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_stat_in_operationDefinition2351 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_operationDefinition2353 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000300L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2374 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000300L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2418 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_associationDefinition2458 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2466 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2478 = new BitSet(new long[]{0x0000800000400010L});
    public static final BitSet FOLLOW_47_in_associationDefinition2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2522 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2524 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2530 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2545 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_associationEnd2566 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_67_in_associationEnd2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2582 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2594 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_68_in_associationEnd2606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2610 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2622 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2624 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_associationEnd2628 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2646 = new BitSet(new long[]{0x0000000000000092L,0x000000000000001CL});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2698 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity2708 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2712 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2741 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange2751 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_invariant2840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant2850 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_COMMA_in_invariant2863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant2867 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_COLON_in_invariant2875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_invariant2887 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2899 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_invariantClause2930 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2936 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2941 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_invariantClause2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_invariantClause2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_invariantClause2957 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2963 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2968 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_invariantClause2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_prePost2998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost3002 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost3004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost3008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_prePost3012 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000300L});
    public static final BitSet FOLLOW_COLON_in_prePost3016 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_prePost3020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_prePostClause_in_prePost3039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_prePostClause3078 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3093 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3098 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_prePostClause3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3129 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_annotation3148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_annotation3152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3158 = new BitSet(new long[]{0x0000000000000150L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3195 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3207 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3226 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3231 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_expression3423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_expression3427 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_COLON_in_expression3431 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_expression3435 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3440 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_expression3444 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expression3446 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList3504 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3521 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_paramList3533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3537 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_paramList3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList3586 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_idList3596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_idList3600 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration3631 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration3633 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_conditionalImpliesExpression3686 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_conditionalOrExpression3748 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionalXOrExpression3809 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_conditionalAndExpression3870 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3922 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3941 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3951 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4000 = new BitSet(new long[]{0x000000000E010002L});
    public static final BitSet FOLLOW_set_in_relationalExpression4018 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4036 = new BitSet(new long[]{0x000000000E010002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4086 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression4104 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4114 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4164 = new BitSet(new long[]{0x0000000040200002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4182 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4196 = new BitSet(new long[]{0x0000000040200002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_unaryExpression4258 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4335 = new BitSet(new long[]{0x0000000080000402L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression4353 = new BitSet(new long[]{0x0000000000000010L,0x00000000003C0000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression4359 = new BitSet(new long[]{0x0000000000000010L,0x00000000003C0000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression4370 = new BitSet(new long[]{0x0000000080000402L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4447 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4477 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression4481 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4485 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4487 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_primaryExpression4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference4537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_objectReference4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression4684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression4691 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression4702 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression4706 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_queryExpression4717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_iterateExpression4755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4779 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4781 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4789 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4839 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4861 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression4874 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4887 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression4891 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4903 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4920 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression4935 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4950 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression4954 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4968 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_AT_in_operationExpression4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_operationExpression4995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression5015 = new BitSet(new long[]{0x0004000E30500070L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression5036 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5048 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_operationExpression5052 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression5121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression5137 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_typeExpression5141 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5181 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5184 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5188 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration5198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5204 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5207 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5213 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization5241 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization5243 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_variableInitialization5247 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization5249 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_variableInitialization5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ifExpression5285 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_ifExpression5289 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifExpression5291 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_ifExpression5295 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ifExpression5297 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_ifExpression5301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ifExpression5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_literal5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_literal5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal5408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal5424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal5426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral5528 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral5557 = new BitSet(new long[]{0x0004000E30508030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5574 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral5587 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5591 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem5639 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem5650 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_collectionItem5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_emptyCollectionLiteral5683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral5685 = new BitSet(new long[]{0x0000000000000000L,0x000000083E000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5689 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5707 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral5709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_undefinedLiteral5741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5743 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5747 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_undefinedLiteral5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_undefinedLiteral5777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5779 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_undefinedLiteral5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_tupleLiteral5838 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5852 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5867 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5909 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_COLON_in_tupleItem5948 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_tupleItem5952 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem5954 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_tupleItem5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem5980 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_expression_in_tupleItem5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_dateLiteral6035 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral6037 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral6041 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType6217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType6244 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_collectionType6248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_tupleType6284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType6286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6295 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_tupleType6306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6310 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart6354 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_tuplePart6356 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_tuplePart6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly6409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat6444 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_stat6455 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_nextStat_in_stat6461 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_singleStat_in_nextStat6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6737 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6789 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6793 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6841 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6845 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_objCreateStat6879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6887 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6897 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_objCreateStat6933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6941 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6955 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_objDestroyStat6999 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_lnkInsStat7033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat7037 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat7051 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_lnkInsStat7055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7092 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7103 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7112 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7135 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7146 = new BitSet(new long[]{0x0000000000004102L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7157 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7166 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7173 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7195 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7210 = new BitSet(new long[]{0x0000000000004102L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7230 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7241 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7250 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_104_in_lnkDelStat7291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat7295 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7305 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat7309 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_lnkDelStat7313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_condExStat7353 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat7362 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_condExStat7366 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_stat_in_condExStat7375 = new BitSet(new long[]{0x0010800000000000L});
    public static final BitSet FOLLOW_52_in_condExStat7386 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_stat_in_condExStat7398 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_condExStat7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_iterStat7434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_iterStat7442 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iterStat7446 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat7454 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_iterStat7458 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_stat_in_iterStat7466 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_iterStat7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_whileStat7496 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat7504 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_whileStat7508 = new BitSet(new long[]{0x0005000E30500030L,0x0000097FFFBD0400L});
    public static final BitSet FOLLOW_stat_in_whileStat7516 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_whileStat7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17668 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17682 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17692 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27731 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27739 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27747 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27761 = new BitSet(new long[]{0x0004000E30500030L,0x0000001FFFBD0400L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27771 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17885 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin17900 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17910 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27958 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27966 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27980 = new BitSet(new long[]{0x0004000E30500030L,0x0000000FFFBD0400L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27990 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_nothing_in_identList8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18071 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_identListMin18085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18095 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator5939 = new BitSet(new long[]{0x0000000000000010L,0x0000000A3E000000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator5941 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator6550 = new BitSet(new long[]{0x0000000000000002L});

}