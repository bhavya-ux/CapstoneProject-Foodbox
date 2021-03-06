{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033\deflangfe1033{\fonttbl{\f0\fmodern\fprq1\fcharset0 Courier New;}{\f1\fmodern\fprq1\fcharset0 Consolas;}{\f2\fswiss\fprq2\fcharset0 Calibri;}}
{\colortbl ;\red85\green85\blue85;\red102\green102\blue102;}
{\*\generator Riched20 10.0.17134}{\*\mmathPr\mnaryLim0\mdispDef1\mwrapIndent1440 }\viewkind4\uc1 
\pard\widctlpar\cf1\f0\fs20 import\f1\fs23  \f0\fs20 static\f1\fs23  \f0\fs20 org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 static\f1\fs23  \f0\fs20 org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;\f1\fs23\par
\~\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.junit.Before;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.junit.Test;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.mockito.InjectMocks;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.mockito.MockitoAnnotations;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.springframework.test.web.servlet.MockMvc;\f1\fs23\par
\f0\fs20 import\f1\fs23  \f0\fs20 org.springframework.test.web.servlet.setup.MockMvcBuilders;\f1\fs23\par
\~\par
\f0\fs20 import\f1\fs23  \f0\fs20 com.flyaway.RestaurantController;\f1\fs23\par
\~\par
\f0\fs20 public\f1\fs23  \f0\fs20 class\f1\fs23  \f0\fs20 TestController \{\f1\fs23\par
\~\par
\cf2\f0\fs20\~\~\~\~\cf1 @InjectMocks\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\cf1 private\f1\fs23  \f0\fs20 RestaurantController;\f1\fs23\par
\~\par
\cf2\f0\fs20\~\~\~\~\cf1 private\f1\fs23  \f0\fs20 MockMvc mockMvc;\f1\fs23\par
\~\par
\cf2\f0\fs20\~\~\~\~\cf1 @Before\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\cf1 public\f1\fs23  \f0\fs20 void\f1\fs23  \f0\fs20 setup() \{\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\~\~\~\~\cf1 MockitoAnnotations.initMocks(this);\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\~\~\~\~\cf1 this.mockMvc = MockMvcBuilders.standaloneSetup(RestaurantController).build();\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\cf1\}\f1\fs23\par
\~\par
\cf2\f0\fs20\~\~\~\~\cf1 @Test\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\cf1 public\f1\fs23  \f0\fs20 void\f1\fs23  \f0\fs20 testInvalid() throws\f1\fs23  \f0\fs20 Exception \{\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\~\~\~\~\cf1 this.mockMvc.perform(get("/restaurant")).andExpect(status().isOk());\f1\fs23\par
\cf2\f0\fs20\~\~\~\~\cf1\}\f1\fs23\par
\f0\fs20\}\f1\fs23\par

\pard\widctlpar\sa160\sl252\slmult1\cf0\f2\fs22\par
}
 