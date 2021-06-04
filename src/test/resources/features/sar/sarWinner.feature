Feature: ScoreResult

  Scenario: 胜负判定
    Given mm:
      | param1     | param2     | param3     | param4     | param5     | result     | winner     | winPoint     |
      | 参数1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
      | 参数1 | 1 | 1 | 1 | 1 | 2 | 1 | 1 |
      | 参数1 | 1 | 1 | 1 | 1 | 1 | 3 | 1 |