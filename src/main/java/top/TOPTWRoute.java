package top;

/**
 *
 * @class TOPTWRoute
 * @brief Class to represent the route
 *
 */
public class TOPTWRoute {
    int predecessor;
    int succesor;
    int id;

    /**
     * @brief Constructor
     */
    TOPTWRoute() {
        
    }

    /**
     * @brief Constructor
     */
    TOPTWRoute(int pre, int succ, int id) {
        this.predecessor = pre;
        this.succesor = succ;
        this.id = id;
    }

    /**
     * @brief Getter
     */
    public int getPredeccesor() {
        return this.predecessor;
    }

    /**
     * @brief Getter
     */
    public int getSuccesor() {
        return this.succesor;
    }

    /**
     * @brief Getter
     */
    public int getId() {
        return this.id;
    }

    /**
     * @brief Setter
     */
    public void setPredeccesor(int pre) {
        this.predecessor = pre;
    }

    /**
     * @brief Setter
     */
    public void setSuccesor(int suc) {
        this.succesor = suc;
    }

    /**
     * @brief Setter
     */
    public void setId(int id) {
        this.id = id;
    }
}
