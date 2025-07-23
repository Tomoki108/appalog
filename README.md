# Appalog

アパレル特化の家計簿アプリ。PoC 段階なので、サーバーサイドのみ。ローカルで起動すればよく、CLI で動作確認できればよし。

## ユースケース

- price, category(ex, tops, outer, bottoms, shoes, ...), date, brand カラムを持つログを受け取り記録する。
- start_date, end_date, category, brand でフィルタリングして、ログを取得する。
- start_date, end_date, category, brand でフィルタリングして、ログの集計結果を取得する。

## 技術スタック

- API: Kotlin, Ktor
- Data Store: Minio (Parquet 形式)
- Cache: Redis
- Message Queue: Apache Kafka
- Container: Kubernetes, Docker
