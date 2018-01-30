<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>User authentication regression test suite</description>
   <name>User Authentication</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <lastRun>2018-01-29T23:19:48</lastRun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>52453763-4fc5-48ca-b892-83c0e1df1b84</testSuiteGuid>
   <testCaseLink>
      <guid>8ccdc011-6d5d-4fa9-b846-d2a616ac7e92</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Login/validate_Login Page</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>992bfc9d-ab64-43c2-86cf-ce387a3b3549</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-2</value>
         </iterationEntity>
         <testDataId>Data Files/Login</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>992bfc9d-ab64-43c2-86cf-ce387a3b3549</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email/username</value>
         <variableId>2e33013c-fe81-4e0d-961d-b7cd646e9908</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>992bfc9d-ab64-43c2-86cf-ce387a3b3549</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>248e45fb-baf3-49ba-814b-dfd3581076d3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>52095aa9-a9e8-4c0e-8b10-238d0bd5e865</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User Login/verify_Successful User Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>febaeea9-8dd7-4106-95f8-94e5415eedd2</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>3-3</value>
         </iterationEntity>
         <testDataId>Data Files/Login</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>febaeea9-8dd7-4106-95f8-94e5415eedd2</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email/username</value>
         <variableId>e9f0f335-bc5f-4321-b06c-e3c3d9806ef0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>febaeea9-8dd7-4106-95f8-94e5415eedd2</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>8eac8019-c675-4114-a3fd-4d21b015d9f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>febaeea9-8dd7-4106-95f8-94e5415eedd2</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Fullname</value>
         <variableId>2947a425-7500-4f37-955a-e8aa8e677ee5</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
