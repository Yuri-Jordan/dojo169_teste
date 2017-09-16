

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TradutorAlfaNumericoTest {
    
    TradutorAlfaNumerico trad;
    
    @Before
    public void setUp() {
        trad = new TradutorAlfaNumerico();
    }

    
    @Test
    public void mensagemVazia(){
       
        assertTrue(trad.mensagemVazia());
    }
    
    
    @Test
    public void verificarInicializacaoMensagem(){
        trad.digitar("A");
        assertFalse(trad.mensagemVazia());
    }
    
    
    @Test(expected = MensagemInvalidaException.class)
    public void mensagemMaiorQuePermitido(){
        
        trad.digitar
        (
            "The text\n" +
            "Lorem ipsum dolor sit amet, consectetur iucunde sapienter. Proprium ceteras qua esse administrandae partitionem altera et Iuniani ut servare nisi in obscurare bonum se quam. Modo litteris meliorem vetere nec altera tractavissent ad quo esse tanti quam rationem periculum cum! Censores consuetudinis non eaque vehementer contentionis pars debet, ut quae eandem mihi alter constituta corporis, et de tantum. Ingeniis remota duas contionibus. Iudices vim quem elaborandum iudicium essemus quem viam facilius sit nisi! Haec re partem quam alter etiam bonum viam attingere elaborandum propria et tris defensione et. Perspicio apti vitam condemnatus inter criminum haec nihil posse esse etiam etiam altera vacare et. Quam esse invidiae invidiae debet ea partim, quo ab quem iustituiam. Videtur et haec materia dicendo invidia quae philosophi maturius! Est et retentam voluptatibus quam omnem ardentius maximis partitionem appetere quam easque. Iudicio est tractavissent qui. \n" +
            "\n" +
            "Laboris vos dicendi nos vehementer totam societatem. Ipsi quae dixerim iudicii in modo difficultatis in re remota a voluptatibus. Insitam est iudicii perfruique exquisitaque iam sit. Invidiosum confidere haec fore fore servare vim et et! Apertam iudicium procul facilius censores iudicii a duas essemus ingeniis moderatisque cupiditatem. Certum modo altera iudices nisi fore criminibus invidia perfruique altera ad cupiditatem quod orationem iusteque. Etiam virtutes eum ego et bonum eiusdem nihil iudiciis sit constituta. Adiuvet et nihil litteris animadverti nos? Re facilius ad mihi temperantiam bonum animadverti, magno virtutes communis meditati re Iuniani bonum ea me esse? Proprium insitam non, animi, sic tantum quae is omni et nec. Invidiae in viam quantum facere libertatemque summis Latinis essemus, nisi fuisse quod melius iudices enim dicendo iucunde invidia. Certum ad remota natosque modo rationem mihi quae dolore ego tractavissent intellegant modo enim magno utraque dolore viderent? \n" +
            "\n" +
            "Exquisitaque se videbatur duas re accusatores homini satis est is tum virtutes condicionem quem quem debet sit natosque. Ut altera sumptibus quam animi bonum inter philosophiam ad distributionem modo. Philosophiam certe huius vestri cum iudicio tractatione natos iusteque fuisse, vacillant animadverti est iustituiam iudicii ab. Ea et retentam et. Et per ut illustresque! Defensione pars et arbitrantur et invidia, nihil animi vivi meditati. Proprium utraque nihil magno quam? Nihil exquisitaque sit quem temperantiam? Iudicium arbitrantur et est defensione sua iam cum videmus satis ita quae. Quandam is condemnatus voluptatibus et esse appetere invidia philosophiam vivatur, totam debet meditati dolore. \n" +
            "\n" +
            "Differunt subterfugere maturius magnificentius, diviserunt libertatemque quantum nihil est apti ut argumento communiter cum? Debet bonum videmus, criminum et summum videbatur altera insitam. Etiam tris censores summis esse iudicia condicionem est moderatisque. Maximis agendo et maximis procul moderatisque et humani dixerim sermone, nihil et criminum certe est concitatis satis. Invidiosum artium fore ingeniis, sapienter nihil non, opere communiter miseram ipsi ea collegerunt. Haec vitam subterfugere modo elaborandum magnificentius ut innatam Graeco in maximis diviserunt. Innatam viderent libertatemque, aliis etiam accommodatior partem rationem agendo dolore materia similes. Animi tris corporis in esse concitatis agendo legitimae satis iudices certum corporis. Exquisitaque ab virtutes iudicia quam et sunt quantum modo sit, dico directam vos viam subterfugere modo quae. \n" +
            "\n" +
            "Sortito censores duas generis defensionis sapienter veneficii servare iudicii iudicia contionibus beate invidiosum quam. Dicendo quam praetermittatur dico et sunt, in et sapienter fore! Ingeniis mandaremus orationem temperantiam, artium et, foris, divisam beate criminum inveterata, easque obscurare eum dixerim illustresque videbatur. Iudicii ad nec iudicii foris tractatione. Est in rationem vivendi et potius. Esse vehementer elaborandum mihi, invidiae cum censores causa. Ea in in beate. Cupiditatem habere quantum facere, voluptatibus animadverteretur quo ingeniis alterius quo iucunde inveterata? Vel per exquisitaque altera tractavissent modo quod ad nimis vacillant. Latinis intellegant ego criminibus, esse viderent non quae est. \n" +
            "\n" +
            "Magnificentius niti administrandae, iudicii etiam et esse. Praeclaram foris sapienter in reliquarum re non, ipsi eas sic condemnatus. Directam fuisse quem eas moderatisque invidia dicitis, iudicii timide perfruique, ad maturius voluissent considero. Ego intellegant diviserunt non sit quae natosque eandem agendo habitura iudicium intellegant Latinis viderent quantum quam. Ceteras vos ad nihil homini debet tractavissent hanc neque vivatur? Elucere modo se, modo communiter in brevis, illud considero philosophiam magnae nihil notae communis omnem. "
            + ""
        );
    }
    
    @Test(expected = MensagemInvalidaException.class)
    public void isMensagemString(){
        trad.digitar(trad.digitar("55656"));
    }
    
    @Test
    public void mapearUmaLetra(){
        assertEquals("9", trad.digitar("w"));
    }
    
    @Test
    public void mapearDuasLetras(){
        assertEquals("2333", trad.digitar("af"));
    }
    
    @Test
    public void mapearEspaco(){
        assertEquals("0", trad.digitar(" "));
    }
    
    @Test
    public void mapearRepeticaoReferenciaLetra(){
        assertEquals("2_222", trad.digitar("AC"));
    }
    
    @Test
    public void testarUmaFrase(){
        assertEquals("77773367_7773302_222337777_777766606660366656667889999_9999555337777", trad.digitar( "SEMPRE ACESSO O DOJOPUZZLES"));
    }
  
    
}
