abstract class DMPM {
    //when - solving thru automation
    //to be deprecated - perform migration
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
    void ProcessManagement() {
        //Practical Power - shell create processes, delete processes.
        //Create Threads and Threadpool, ExecuterService.
    }
    void MemoryManagement() {
        //Practical Power - JAVA internally for data types, objects creation, garbage collection.
        //malloc, free.
    }
    void DiskManagement() {
        //Practical Power - Use file abstractions and streams.
    }
    void ComputerNetworking() {
        //Practical Power - Sockets Programming
    }
    void FileSystem() {
        //Same as diskManagement
    }
    void DBMS() {
        //Practical Power - Tool for persistsence over V(CRUD)PM of data following ACID properties.
    }
    void DistributedComputing() {
        //Practical Power - ability to do job's tasks across computers.
    }
    void Shell() {
        int process, memory, disk, io, files, network;
    }
    void PlatformEg() {
        Linux();
        Windows()
    }
    void Linux() {
        Distributions();
        Features();
        FHS();  //Filesystem hierarchy standard - compartmentalisation, writability, sharability
        FileTypes();
        UserManagement();
        FileUserPermissions();
        SwitchIdentities();
        RPM();      //DB, package manager, package - syntax of file - name/version/release/architecture
        Libyzipp();     //facade over RPM for Yast, packageKit, zypper, etc - equivalent of yum, etc.
        NetworkManagement();
        StorageAdmin();
        Shell_Suse();
        ProcessAdmin();
        ProcessScheduling();
    }
    void Distributions() {
        //eg - redhat, suse, centos.
        //under it flavors(opensuse, SLES), releases(leap, tumbleweed)
        //phases - GA, SP1 (SP(k)), LTSS - every next SP 1/2 year b4 end of previous SP and 3 years extended support for all SP.
    }
    void Features() {
        YaST();     // configure the network, storage devices, software, and most network services using series of modules like firewall, nfs server, sudo, etc.
        UnifiedInstaller();
        SLESModules_Extensions();      // eg - Server Applications like DHCP, DNS; Web scripting; dev tools.
    }
    void YaST() {
        CommandLineNonInteractive();
        CommandLineInteractive();
        Graphical();
        Non_Graphical_NCurses();
    }
    void FHS() {
        //boot – boot loader files
        //proc – virtual filesystem with kernel and process information
        //sbin – system binaries - mount, ping, m5, reboot, ifconfig.
        //bin – user binaries - sh, date, bash, kill, cat.
        //lib – libraries - all softwares.
        //etc – configuration files - ssh config, zshrc, zprofile.
        //run – run-time variable data -
        //var – variable files - McAfee, mail, etc.
        //usr – programs, libraries and more - has bin, sbin, lib, src everything - like user environment besides system env.
        //root – root user home directory
        //opt – optional and third-party applications - my own downloaded binaries, installers, packages, libraries.
        //home – user home directories - empty.
        //tmp – temporary files - temporarily stored by any application.
        //srv – site-specific data served by the system
        //mnt – temporarily mounted filesystems
        //dev – device files
        //sys – information about devices, drivers, etc.
    }
    void FileTypes() {
        int normal, directory, links;   //symlinks point to same iNode.
        int sockets, pipes, blockCharacters, characterDevices;  //logical endpoint for process comm, comm of output of process over FS
    }
    void UserManagement() {
        //user and group id
        //etc/passwd, /etc/group, /etc/shadow - login:password:userId:primaryGroupId:Comments:HomeDir:Shell
        //groupName:GroupPassword:GroupId:ListOfSecondaryGroupMembers; shadow has password hashes, last change, next change
    }
    void FileUserPermissions() {
        //ls -l -> TypeNPermission:LinksAndContent:Ownership:FileSize:ModificationTime:FileName
        //user, group, others X rwx - owner has rwx by default and others are set.
        //standard, binary, octal notations; chown, chmod, chgrp.
        //sticky bit - delete files under directory if owner of directory.
    }
    void SwitchIdentities() {
        //SubstituteUser (su), switchPrimaryGroup (sg)
        //privilege delegation - sudo (superuser do or substitute user do)
        // /etc/sudoers maintains config for sudo use visudo to edit; required root privilege
        //syntax - user/group host = commands
        //permits user and command aliases as combinations.
    }
    void RPM() {
        //options i for install, e for uninstall, q for query, U for update, F for reinstall
    }
    void NetworkManagement() {
        //device, interface, link, address, broadcast, route.
        /*System’s hostname: /etc/hostname
        Local name resolution: /etc/hosts
        DNS servers: /etc/resolv.conf
        Order of name resolution services: /etc/nsswitch.conf*/
        //ifstatus eth0, ifup, ifdown.
        //ping, traceroute, firewall cmd and config - used by the graphics.
    }
    void StorageAdmin() {
        //layers - physical, data access protocol layer, logical storage (device mapper, etc), block device, file system, file system mount layer (FHS)
        //partitioning utils
        //MBR and GPT
        //supported File Systems
        //commands - mount, umount, lslbk (list block devices), blkid, df (disk free space), du, lsof (list open files), fuser (list procs using a file)
    }
    void Shell_Suse() {
        //most basic UI - bash, csh, ksh, tcsh, zsh.
        //components - variables, functions (core functionality), alias.
        //invokes as login shell or not (inherit env) - etc/profile, /etc/bash.bashrc, user specific (~/.profile, ~/.bashrc, ~/.alias) in order of execution
        //cmd - alias, unalias - file at ~/.alias; ~/.bash_history
        //tab for autocomplete.
        //channel redirection - pipes, redirection to (into, append, error into) file, redirection from file.
        //command chaining - using ";"; && to mean run second if 1st successful, || to run second if first errors.
        //man command
    }
    void ProcessAdmin() {
        //program, process, task.
        //user and daemon (no controlling shell or terminal); pid - parent and child
        //cmd - ps, pstree, top, kill, killall, nice, renice, ctrl+z, bg, fg, jobs,
    }
    void ProcessScheduling() {
        //Cron Jobs options - elr - edit list remove.
        //minute thru month and day of week run this shell file - when who what.
        //dir - /etc/cron.hourly, etc.
        //cron architecture
        // The at daemon - at, batch, atq, atrm, /etc/at.allow, /etc/at.deny - listed users can or not define jobs.
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
        int browser;
        int Bootstrap, JQuery;
        int Silverlight, SapUI5, SAP FIORI;
        int Angular, React;
    }
    void WebFrameworks() {
        //HTTP web standardized communication
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