# USE CASE: 1 Produce a report with all the countries in the world, organised by largest population to smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *assistant* I can produce a *report with all the countries in the world, organised by largest population to smallest*, so that I can *provide population information to the management of the organisation*.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know how we want the data sorted.  Database contains population levels of all countries.

### Success End Condition

The report shows all the countries in the world sorted by largest population to smallest.

### Failed End Condition

The report is not generated.  The report is not sorted.

### Primary Actor

Assistant.

### Trigger

Assistant is asked for population information by the management.

## MAIN SUCCESS SCENARIO

1. Assistant is asked for a report on population levels by country.
2. Assistant captures how the report is to be sorted.
3. Assistant obtains the information from the database, sorted correctly.
4. Report is produced for management.

## EXTENSIONS

**Information is not on the database**:

    1. Assistant checks the details are correct.
    2. Assistant informs management that the report failed.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0