abstract class DMPM {
    //when - solving thru automation
    DPMPM() {
        RnD(1);
        Systems();
        DevOps();
        DataAnalytics();
    }
    void RnD(int maths) {
        DiscreteMaths();
        Probability();
        Statistics();
        LinearAlgebra();
        TOC();  //Model verification also.
    }
    void DiscreteMaths() {
        Logic();
        SetTheory();
        GroupTheory();
    }
    void Logic() {
        Propositional();
        Predicate();
        //...
    }
    void SetTheory() {
        Cardinality();  //PnC();
        functions();
        relations();    //graph theory, recurrence
    }
    void GroupTheory() {
        //Algebra (or group theory, Lattice, closure,
        //abstract world governing laws - quadratics, linear equations, recurrence pattern
    }
    void Probability() {}
    void Statistics() {}
    void LinearAlgebra() {}
    void TOC() {
        FSM();
        //More
        TuringMachine();
    }
    void Systems() {
        //when - already solved - use outta box.
        Platform();
        Framework();
    }
    void Platform() {
        InternalPlatformAbstraction();
        Shell();
        PlatformEg();
    }
    void InternalPlatformAbstraction() {
        //when - arch of workings of system calls
        ProcessManagement();
        MemoryManagement();
        DiskManagement();
        ComputerNetworking();
        FileSystem();
        DBMS();
        DistributedComputing();
    }
    void Shell() {
        int process, memory, disk, io, files, network;
    }
    void PlatformEg() {
        Suse();
        Linux();
        Windows()
    }
    void Framework() {
        StandaloneAppsFramework();
        ClientFrameworks();
        WebFrameworks();
        ApplicationFrameworks();
        DatabaseFrameworks();   //JDBC
        UtilityFrameworks();    //Spark, Tensorflow.
    }
    void StandaloneAppsFramework() {
        JAVA_AWT();     //swings, fx, applet.
    }
    void ClientFramework() {
        int Bootstrap, JQuery;
        int Silverlight, SapUI5, SAP FIORI;
        int Angular, React;
    }
    void WebFrameworks() {
        Struts();
        ABAPServer();
        NodeExpress();
        Spring();
    }
    void ApplicationFrameworks() {
        NGAP(); //NW
        PDFramework();  //Procurement Document Framework
        X4();   //BAF
    }
    void Spring() {
        SpringSecurity();
        SpringCore();
        SpringMVC();
        SpringAOP();
        SpringJPA();
        SpringBoot();
    }
    void SpringCore() {
        Beans();
        Autowiring();
        //More
    }
    void DevOps() {
        //when - something needs automation
        Scrum();
        Design();
        Development();
        Quality();
        Deployment();
        Maintenance();
    }
    void Scrum() {
        Planning();
        DailyScrum();
        ReviewRetrospective();
    }
    void Design() {
        ApplicationHLD();
        SystemDesign(); //all utils and servers organized
        ApplicationLLD();
    }
    void SystemDesign() {
        LoadBalancer();
        Microservices();            //or monoliths
        ComputationEngines();       //Spark, hadoop
        StorageEngines();           //kafka, NoSQL.
        //ConsistentHash();
    }
    void Development() {
        PLControls();   //Paradigms
        DataStructures();
        Algorithms();
    }
    void PLControls() {
        Procedural();
        OOP();
        Functional();
    }
    void Procedural() {
        Variables();
        Functions();
        IO();   //standard, files, utilitities
        MM();   //pointers, refs
        SystemsCalls();     //Sockets() for networking, OS calls, etc.
    }
    void IO() {
        Regex();
        Parsers();  //grammar based, postfix based
        UtilsBasedIO();   //File, DB or cloud system calls
        MessageQueue();
    }
    void UtilsBasedIO() {
        DB_InConsistent();
        DB_UnAvailable();
        DB_PartitionIntolerant();
    }
    void DB_InConsistent() {
        Cassandra():    //Eventual consistency for timeseries.
    }
    void DB_UnAvailable() {
        Redis();        //Also HBase, Mongo
    }
    void DB_PartitionIntolerant() {
        RDBMS();
        Kafka();
    }
    void OOP() {
        Abstraction();      //abstract methods, interfaces, etc.
        Encapsulation();    //Package, modifiers
        Polymorphism();     //Overloading
        Inheritance();      //Overriding
        OOAD();             //SOLIDPrinciples
        DesignPatterns();
        OOPEg_JAVA();
    }
    void DesignPatterns() {
        Structural();
        Creational();
        Behavioral();
    }
    void OOPEg_JAVA() {
        int String, Date, Regex, IO, JDBC, RMI;
        AutoBoxing();
        VarArgs();
        Premain();
        Enum();
        InnerClass();
        Collections();
        ExceptionHandling();
        Reflections();
        Generics();
        Annotations();
        JAVA8();
        MultiThreading();
        JAVANetworking();
    }
    void JAVA8() {
        FunctionalInterface();
        Lambda();   //functional chaining
        MethodReference();
        Optional();
    }
    void Functional() {
        //lambda, closure, ?events (unofficial) etc.
    }
    void DataStructures() {
        Sets();
        Lists();
        Queue();
        Stack();
        Tree();
        Graph();
    }
    void Algorithms() {
        Housekeeping();
        Logic();    //patterns, maths
        Induction();
        BackTracking();
        Reduction();
        AdvancedAlgorithms();
    }
    void Logic() {
        ProveWrong();
        CaseExhaustive();
    }
    void Induction() {
        Linear();
        DnC();
    }
    void BackTracking() {
        Brute();
        Greedy();
        BnB();
        DP();
    }
    void Reduction() {
        PiggyBack();    //take advantage of an existing algorithm and do some manipulation to your interest
        Pipelines();    //sequence algos (like first sort then do sth else); introduce a new tracker data structure, etc.
        HigherAbstractions();   //use libs, frameworks, utils or services.
    }
    void AdvancedAlgorithms() {
        LinearProgramming();
        ApproximationAlgorithms();
    }
    void Quality() {
        UnitTest();
        IntegrationTest();
        SystemTest();
    }
    void UnitTest() {
        MochaChai();
        JUnit();
        ScalaUnit();
        Mockito();
        PowerMockito();
        Jacoco();
    }
    void IntegrationTest() {
        Incremental();     //UT extended as top down or bottom up
        BigBangTest();
    }
    void BigBangTest() {
        BOUM2();
        PostmanScripts();
        JMeter();
    }
    void SystemTest() {
        Selenium();
        StartScripts();
    }
    void Deployment() {
        GIT();
        Maven();
        Cloudfoundry();
        Jenkins();
    }
    void GIT() {
        int gitPatch;
        GIT_Branch();
        GIT_Patch();
        GIT_Stash();
        GIT_Staging();
        GIT_Commit();
        GIT_Remote();
    }
    void GIT_Patch() {
        int WorkspaceChanges;
        GIT_Log();
        GIT_patch_create();
    }
    void GIT_Stash() {
        stash_push();
        stash_pop();
        stash_clear();
    }
    void GIT_Staging() {
        GIT_Add();
        GIT_Cache_remove();
        GIT_Status();
    }
    void GIT_Commit() {
        GIT_AddCommit();
        GIT_Logs();
        GIT_AmendCommit();
        GIT_RewriteHistory();
    }
    void GIT_Remote() {
        GIT_Push();
        GIT_Pull();
        GIT_Fetch();
        GIT_Merge();
        GIT_Force_Push();
    }
    void Maven() {
        Environment();
        POMWorld();             //Universal Projects, artifacts (templates)
        StandardBuildLifecycles();      //phase, goals
        Profiles();
        Repositories();
        Dependencies();
        Plugins();
        Site();                 //Documents
        BuildAutomation();      //Pipelines, Deployment automation to nexus
        IDESpecifics();
        MultiModuleApproach();
    }
    void StandardBuildLifecycles() {
        CleanLifecycle();
        DefaultBuildLifecycle();    //phases, goals
        SiteLifecycle();
    }
    void DefaultBuildLifecycle() {
        validate();
        compile();
        test();
        package1();
        verify();
        install();
        deploy();
    }
    void Plugins() {
        int dependency, shade, assembly, compiler, jacoco, springboot, sonar, surefire;
    }
    void Cloudfoundry() {
        push();
        startStop();
        restage();
        restart();
        status();
        env();
        delete();
    }
    void Jenkins() {
        //stages, step - build jobs, Code analysis
    }
    void Maintenance() {
        BusinessIssue();        //Documentations or bots, L0
        FuntionalityIssue();    //consulting, L1
        ArchitecturalIssue();   //L2 - call never gets made to this module.
        ImplementationIssue();  //L3 - Bad coding or case not considered.
    }
    void DataAnalytics() {
        //when - data analysis needs automation
        OLAP();
        DataEngg(); //Distributed
        Exploratory();
        DataScience();
        ToolsEg();
        MLAbstractApplications();
    }
    void ToolsEg() {
        Excel();
        Tableau();
        IDE();
        Hadoop();
        RLibs();
        DeepLearning();
    }
    void DeepLearning() {
        TensorFlow();
        PyTorch();
        Theano();
        Keras();
    }
    void MLAbstractApplications() {
        MLBusiness();
        NLP();          //chatbot, VPA for DNN.
        DIP();          //Self driving cars, Recognition, detection (computer vision) from CNN
        DSP();
        Forecasting();  //traffic, stocks, next word, etc from RNN
    }
    void MLBusiness() {
        Regression();
        Classification();   //spam
        Compression();
        Clustering();
        FraudDetection();   //outliers,
        AssociationRules();
        RecommendationEngine();
    }
}