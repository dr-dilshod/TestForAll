package de.uniol.como.generator.DifferenceLanguage;

public interface Abstraction {
	public String createAbstraction(String gDiff_UUID
        	, String SEPARATOR
        	, String NIL
        	, String EOPPOSITE_FEATURE_BASE
        );
//    {
//        return gDiff_UUID + SEPARATOR  + NIL  + EOPPOSITE_FEATURE_BASE ;
//    }
	public String changeSEPARATOR(String gDiff_UUID, String newSEPARATOR);// {   
//    	return gDiff_UUID + ".changeSEPARATOR(" + newSEPARATOR + ")";
//    }
	public String changeNIL(String gDiff_UUID, String newNIL);// {   
//    	return gDiff_UUID + ".changeNIL(" + newNIL + ")";
//    }
	public String changeEOPPOSITE_FEATURE_BASE(String gDiff_UUID, String newEOPPOSITE_FEATURE_BASE); //{   
//    	return gDiff_UUID + ".changeEOPPOSITE_FEATURE_BASE(" + newEOPPOSITE_FEATURE_BASE + ")";
//    }
	public String deleteAbstraction(String gDiff_UUID); //{
//        return gDiff_UUID + ".delete()";
//    }
}