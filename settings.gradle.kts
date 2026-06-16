rootProject.name = "kotlin-masterclass"

// Include all 22 lesson modules
for (i in 1..22) {
    val lessonName = String.format("lesson%02d", i)
    val dirName = when (i) {
        1 -> "lesson01_setup"
        2 -> "lesson02_variables"
        3 -> "lesson03_data_types"
        4 -> "lesson04_operators"
        5 -> "lesson05_input_output"
        6 -> "lesson06_conditions"
        7 -> "lesson07_loops"
        8 -> "lesson08_functions"
        9 -> "lesson09_arrays"
        10 -> "lesson10_collections"
        11 -> "lesson11_null_safety"
        12 -> "lesson12_oop"
        13 -> "lesson13_data_classes"
        14 -> "lesson14_enums"
        15 -> "lesson15_sealed_classes"
        16 -> "lesson16_extension_functions"
        17 -> "lesson17_lambdas"
        18 -> "lesson18_higher_order_functions"
        19 -> "lesson19_generics"
        20 -> "lesson20_exception_handling"
        21 -> "lesson21_file_handling"
        22 -> "lesson22_coroutines"
        else -> throw IllegalArgumentException("Unknown lesson number")
    }
    include(dirName)
}

// Include mini projects (nested modules)
include("mini_projects:Calculator")
include("mini_projects:StudentManagement")
include("mini_projects:BankingSystem")
include("mini_projects:LibraryManagement")
include("mini_projects:ExpenseTracker")
include("mini_projects:TodoConsoleApp")

// Include final project (nested module)
include("final_project:CompleteManagementSystem")
