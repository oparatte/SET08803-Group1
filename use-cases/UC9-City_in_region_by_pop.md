# USE CASE: 9 Produce a report on the cities in a country organised by largest population to smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *coordinator* I can get a *report with all the cities in a country organised by largest population to smallest* so that I can *prepare factsheets for the operation team*.

### Scope

Company.

### Level

Summary.

### Preconditions

We know which country we are working in.  We know how we want the data sorted.  Database contains population levels of all the cities in the country.

### Success End Condition

The report shows all the cities in the country sorted by largest population to smallest.

### Failed End Condition

The report is not generated.  The report is not sorted.

### Primary Actor

Coordinator.

### Trigger

Coordinator needs to prepare factsheets for the operation team.

## MAIN SUCCESS SCENARIO

1. Operation team needs factsheets for a country.
2. Coordinator understands which country the team are working in.
3. Coordinator generates report of the cities in the country, sorted by population size.
4. Report is produced for the operations team.

## EXTENSIONS

**Information is not on the database**:

    1. Coordinator checks the details are correct.
    2. Coordinator informs operation team that the report failed.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0