1. Setup data: list of Employee

2. Download and install "TIB_js-studiocomm_6.12.2_windows_x86_64.exe" on https://community.jaspersoft.com/

3. Open TIBCO JavasperSoft, design and copy xml.

4. To create employee.jrxml and pase the content that you coppied.

5. add dependency

       <dependency>
                <groupId>net.sf.jasperreports</groupId>
                <artifactId>jasperreports</artifactId>
                <version>6.9.0</version>
            </dependency>

6. Use JRDefaultScriplet to set variable, parameter call function.
   http://jasperreports.sourceforge.net/api/net/sf/jasperreports/engine/JRDefaultScriptlet.html